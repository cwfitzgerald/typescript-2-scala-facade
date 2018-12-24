package t2sf.frontend.typescript

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
sealed trait ScriptTarget extends js.Object {}
@JSImport("typescript", "ScriptTarget")
@js.native
object ScriptTarget extends js.Object {
	val ES3: ScriptTarget = js.native
	val ES5: ScriptTarget = js.native
	val ES2015: ScriptTarget = js.native
	val ES2016: ScriptTarget = js.native
	val ES2017: ScriptTarget = js.native
	val ES2018: ScriptTarget = js.native
	val ESNext: ScriptTarget = js.native
	val Latest: ScriptTarget = js.native
}