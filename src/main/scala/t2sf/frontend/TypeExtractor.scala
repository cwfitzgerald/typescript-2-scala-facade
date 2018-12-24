package t2sf.frontend

import t2sf.frontend.{typescript => ts}

object TypeExtractor {
	def extract(source: Array[String]): Unit = {
		val options = new CompilerOptions {ts.ModuleKind.CommonJS), target = Some(ts.ScriptTarget.ES2018) }

		val program = ts.createProgram(source, options)
	}
}
