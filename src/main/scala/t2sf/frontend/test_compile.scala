package t2sf.frontend

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import js.Dynamic.{global => g, newInstance => jsnew, literal => lit}
import js.DynamicImplicits._

import io.scalajs.nodejs.fs.Fs

/*
@JSImport("typescript", JSImport.Namespace)
@js.native
object typescript extends js.Object {
	def transpileModule(args: js.Any*): js.Dynamic = js.native
	def transpile(args: js.Any*): String = js.native
}
*/

@JSImport("typescript", "transpileOptions")
@js.native
class TranspileOutput extends js.Object {
	val outputText: String = js.native
	val diagnostics: js.UndefOr[js.Any] = js.native
	val sourceMapText: String = js.native
}

object TranspileOutput {
	def apply(outputText: String, diagnostics: Option[js.Any] = None, sourceMapText: String): TranspileOutput = {
		lit(outputText = outputText, diagnostics = diagnostics.getOrElse(js.undefined), sourceMapText = sourceMapText).asInstanceOf[TranspileOutput]
	}
}

object test_compile {
	def compile(from: String, to: String): Unit = {
		val input_file = Fs.readFileSync(from).toString()

		val transout = TranspileOutput(outputText = "hi", diagnostics=Some("diagnostic"), sourceMapText = "butt")

		println(transout.outputText)
		println(transout.diagnostics.get)
		println(transout.sourceMapText)

		val output = typescript.transpile(input_file)

		Fs.writeFileSync(to, output)
	}
}
