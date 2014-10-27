<<<<<<< HEAD
name := """play-spring-data-jpa"""
=======
name := "play-spring-data-jpa"
>>>>>>> daaadff2aa6bb185d08bccde5fb9bf4482969828

version := "1.0-SNAPSHOT"

playJavaSettings

ebeanEnabled := false

libraryDependencies ++= Seq(
    javaCore,
    javaJpa,
<<<<<<< HEAD
    "org.springframework" % "spring-context" % "4.1.1.RELEASE",
    "javax.inject" % "javax.inject" % "1",
    "org.springframework.data" % "spring-data-jpa" % "1.7.0.RELEASE",
=======
    "org.springframework" % "spring-context" % "3.2.2.RELEASE",
    "javax.inject" % "javax.inject" % "1",
    "org.springframework.data" % "spring-data-jpa" % "1.3.2.RELEASE",
>>>>>>> daaadff2aa6bb185d08bccde5fb9bf4482969828
    "org.springframework" % "spring-expression" % "3.2.2.RELEASE",
    "org.hibernate" % "hibernate-entitymanager" % "3.6.10.Final",
    "org.mockito" % "mockito-core" % "1.9.5" % "test"
)