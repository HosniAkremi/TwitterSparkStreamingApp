name := "TwitterSparkStreamingApp"

version := "0.1"

scalaVersion := "2.10.6"
libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.6.0"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.10" % "1.6.0"
libraryDependencies += "org.apache.spark" % "spark-streaming-twitter_2.11" % "1.6.0"