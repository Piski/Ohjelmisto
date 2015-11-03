CC = g++
CFLAGS =-c -Wall
OBJS = kello.o kello_main.o viisari.o
SRCS = $(OBJS:.o=.cpp)
APP = Kello

all: svn-export $(APP) svn-import clean

$(APP): $(OBJS)
	$(CC) $(OBJS) -o $(APP)

svn-export:
	svn export --username m0602227 "https://innoscm.edusrv.metropolia.fi/svn/ohteha/trunk/Kellokay/src/"

svn-import:
	svn import --username m0602227 "https://innoscm.edusrv.metropolia.fi/svn/ohteha-exam/2015/autumn/m0602227/trunk/Kellokay/src/"

$(OBJS):
	$(CC) $(CFLAGS) $(SRCS)	

clean:
	rm *o
