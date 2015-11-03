CC = g++
CFLAGS =-c -Wall
OBJS = kello.o kello_main.o viisari.o
SRCS = $(OBJS:.o=.cpp)
APP = Kello

all: svn-export $(APP) svn-import

$(APP): $(OBJS)
	$(CC) $(OBJS) -o $(APP)

svn-export:
	svn export --force --username m0602227 "https://innoscm.edusrv.metropolia.fi/svn/ohteha/trunk/Kellokay/src" ""

svn-import:
	svn import -m "foo" --force --username m0602227 "https://innoscm.edusrv.metropolia.fi/svn/ohteha-exam/2015/autumn/m0602227/trunk/Kellokay/src/"

$(OBJS):
	$(CC) $(SRCS)	

clean:
	rm *o
