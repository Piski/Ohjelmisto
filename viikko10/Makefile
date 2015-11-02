CC=g++
CFLAGS=-c -Wall
DIR="Ohjelmisto/viikko10"

all: git kertomasovellus clean

kertomasovellus: main.o kertoma.o
	@if [ -f "main.cpp" ] && [ -f "kertoma.cpp" ] ; then \
		$(CC) main.o kertoma.o -o kertoma; \
	elif [ -f "Ohjelmisto/viikko10/main.cpp" ] && [ -f "Ohjelmisto/viikko10/kertoma.cpp" ] ; then \
		cd $(DIR); \
		$(CC) main.o kertoma.o -o kertoma; \
	else \
		echo "files not found"; \
	fi

git:
	@if [ -d "Ohjelmisto/" ] ; then \
		cd "Ohjelmisto" && git pull; \
	elif [ -f "main.cpp" ] && [ -f "kertoma.cpp" ] && [ -f "functions.h" ] ; then \
		git pull; \
	else \
		git clone "git@github.com:Piski/Ohjelmisto.git"; \
	fi

main.o: 
	@if [ -f "main.cpp" ] ; then \
		$(CC) $(CFLAGS) main.cpp; \
	elif [ -f "Ohjelmisto/viikko10/main.cpp" ] ; then \
		cd $(DIR); \
		$(CC) $(CFLAGS) main.cpp; \
	else \
		echo "no main.cpp file found"; \
	fi

kertoma.o:
	@if [ -f "kertoma.cpp" ] ; then \
		$(CC) $(CFLAGS) kertoma.cpp; \
	elif [ -f "Ohjelmisto/viikko10/kertoma.cpp" ] ; then \
		cd $(DIR); \
		$(CC) $(CFLAGS) kertoma.cpp; \
	else \
		echo "no kertoma.cpp file found"; \
	fi

clean:
	@if [ -f "kertoma" ] ; then \
		rm *o; \
	elif [ -f "Ohjelmisto/viikko10/kertoma" ] ; then \
		cd $(DIR); \
		rm *o; \
	else \
		echo "no kertoma file found"; \
	fi
