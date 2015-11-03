PROJPATH=Laskin/

LIB=$(PROJPATH)lib/
SRC=$(PROJPATH)src/
TST=$(PROJPATH)test/laskin/

all: run test

test: 
	cd build/classes/; java -cp ../../$(LIB)junit-4.12.jar:../../$(LIB)hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore \
	laskin.TestSuite
	

run:
	javac -cp $(LIB)junit-4.12.jar:$(SRC)$(SRC)laskin:$(TST) -d build/classes $(SRC)Main.java $(SRC)laskin/Laskin.java $(TST)TestSuite.java $(TST)AbstractParent.java $(TST)NelioTest.java $(TST)ExtraTest.java $(TST)LaskinTest.java
