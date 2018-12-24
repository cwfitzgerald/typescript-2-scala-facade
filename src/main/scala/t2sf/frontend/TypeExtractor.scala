package t2sf.frontend

import t2sf.frontend.{typescript => ts}

object TypeExtractor {
	def extract(source: Array[String]): Unit = {
		val options = new ts.CompilerOptions { module = ts.ModuleKind.CommonJS; target = ts.ScriptTarget.ES2018 }

		val program = ts.createProgram(source, options)

		val checker = program.getTypeChecker()

		program.getSourceFiles().foreach(file => {
			if (file.isDeclarationFile) {

			}
		})
	}
}
