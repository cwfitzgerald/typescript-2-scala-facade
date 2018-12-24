package t2sf

object main {
	def main(args: Array[String]): Unit = {
		frontend.TypeExtractor.extract(Array("typescript.d.ts"))
	}
}
