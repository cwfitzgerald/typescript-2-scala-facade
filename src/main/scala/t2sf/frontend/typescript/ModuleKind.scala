package t2sf.frontend.typescript

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
sealed trait ModuleKind extends js.Object {}
@JSImport("typescript", "ModuleKind")
@js.native
object ModuleKind extends js.Object {
	val None: ModuleKind = js.native
	val CommonJS: ModuleKind = js.native
	val AMD: ModuleKind = js.native
	val UMD: ModuleKind = js.native
	val System: ModuleKind = js.native
	val ES2015: ModuleKind = js.native
	val ESNext: ModuleKind = js.native
}
