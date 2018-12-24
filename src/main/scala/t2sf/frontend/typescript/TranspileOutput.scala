package t2sf.frontend.typescript

import scala.scalajs.js

trait TranspileOutput extends js.Object {
	var outputText: String
	var diagnostics: js.UndefOr[Any] = js.undefined
	var sourceMapText: String
}

