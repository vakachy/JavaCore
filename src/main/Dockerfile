
FROM bellsoft/liberica-openjdk-alpine:latest
COPY ./java ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/Main/Program.java
CMD java -classpath ./out Main/Program