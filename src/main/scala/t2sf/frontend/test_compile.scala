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

object test_compile {
	def compile(from: String, to: String): Unit = {
		val input_file = Fs.readFileSync(from).toString()

		val output = typescript.transpile(input_file)

		Fs.writeFileSync(to, output)
	}
}
