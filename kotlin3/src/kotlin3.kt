import org.opencv.core.*
import org.opencv.core.CvType.*

object kotlin3 {
	init {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME)
    }

    @JvmStatic fun main(args: Array<String>) {
        println("hello opencv")

        val mat = Mat.eye(5, 5, CV_8UC1)
        println(mat.dump())
    }
}