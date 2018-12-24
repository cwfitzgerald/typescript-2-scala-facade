package t2sf.frontend.typescript

import scala.collection.mutable

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("typescript", JSImport.Namespace)
@js.native
object typescriptFunctions extends js.Object {
	@js.native
	def transpileModule(args: js.Any*): js.Dynamic = js.native
	@js.native
	def transpile(source: String): String = js.native
	@js.native
	def createProgram(rootNames: mutable.Seq[String], options: CompilerOptions): Program = js.native
}
