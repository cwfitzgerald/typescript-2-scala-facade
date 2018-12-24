package t2sf.frontend

import scala.collection.mutable
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("typescript", JSImport.Namespace)
@js.native
object typescript extends js.Object {
	def transpileModule(args: js.Any*): js.Dynamic = js.native
	def transpile(args: js.Any*): String = js.native

	@js.native
	sealed trait ModuleKind extends js.Object {}
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

	@js.native
	sealed trait ScriptTarget extends js.Object {}
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

	@js.native
	class Program extends js.Object {

	}

	def createProgram(rootNames: mutable.Seq[String], options: CompilerOptions): Program = js.native
}

trait CompilerOptions extends js.Object {
	var module: js.UndefOr[typescript.ModuleKind] = js.undefined
	var target: js.UndefOr[typescript.ScriptTarget] = js.undefined
}
