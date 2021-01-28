package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(011, "janek12",'M', 1999, 11, 15, 5));
        theForumUserList.add(new ForumUser(122, "karolek",'M', 2003, 2, 11, 0));
        theForumUserList.add(new ForumUser(623, "młody17",'M',1990, 5, 2, 77));
        theForumUserList.add(new ForumUser(724, "justyna.krk",'F', 1979, 12, 25, 12));
        theForumUserList.add(new ForumUser(965, "kwiatek88",'F', 1988, 8, 4, 36));
        theForumUserList.add(new ForumUser(336, "king",'M', 1979, 1, 12, 1));
        theForumUserList.add(new ForumUser(217, "sebix",'M', 2000, 12, 11, 0));
        theForumUserList.add(new ForumUser(158, "kwiatek88",'F', 2005, 6, 6, 9));

    }

        public List<ForumUser> getUserList () {
            return new ArrayList<>(theForumUserList);
        }



    }


