package stubs

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object CountJPGs {
   def main(args: Array[String]) {
     if (args.length < 1) {
       System.err.println("Usage: CountJPGs <file>")
       System.exit(1)
     }

     //TODO: complete exercise

     val sc = new SparkContext()

     val logfile = args(0)
     val jpgcount = sc.textFile(logfile).
       filter(line => line.contains(".jpg")).
       count()

     println("stub is not implemented")

     sc.stop

     System.exit(1)

   }
 }

