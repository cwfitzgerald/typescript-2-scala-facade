package t2sf.frontend.typescript

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

trait CompilerOptions extends js.Object {
	var module: js.UndefOr[ModuleKind] = js.undefined
	var target: js.UndefOr[ScriptTarget] = js.undefined
}
