package t2sf.frontend.typescript

import scala.scalajs.js

trait Program extends js.Object {
	def getTypeChecker(): TypeChecker
	def getSourceFiles(): js.Array[SourceFile]
}
