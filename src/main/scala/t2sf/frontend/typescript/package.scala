package t2sf.frontend

import t2sf.frontend.typescript.Program

import scala.collection.mutable
import scala.scalajs.js

package object typescript {
	@inline
	def transpileModule: (js.Any*) => js.Dynamic = typescriptFunctions.transpileModule
	@inline
	def transpile: String => String = typescript.typescriptFunctions.transpile
	@inline
	def createProgram: (mutable.Seq[String], CompilerOptions) => Program = typescriptFunctions.createProgram
}
