JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
        td9/Media.java \
        td9/Film.java \
        td9/Livre.java \
        MyMain.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
        $(RM) *.class

