package org.example.seminar04.task05;

/*
Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a
Unix-style file system, convert it to the simplified canonical path.

In a Unix-style file system, a period '.' refers to the current directory, a double period '..'
refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a
single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.

The canonical path should have the following format:

The path starts with a single slash '/'.
Any two directories are separated by a single slash '/'.
The path does not end with a trailing '/'.
The path only contains the directories on the path from the root directory to the target file or directory (i.e.,
no period '.' or double period '..')
Return the simplified canonical path.
 */

import java.util.Arrays;
import java.util.Stack;

public class Task05 {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/../"));
        System.out.println(simplifyPath("/home//foo/"));

    }


    public static String simplifyPath(String path) {
        String[] arrayStr = path.split("/");
        System.out.println(Arrays.toString(arrayStr));

        Stack<String> result = new Stack<>();
        for (int i = 0; i < arrayStr.length; i++) {
            if(arrayStr[i].equals("..")) {
                if (!result.isEmpty()) {
                    result.pop();
                }
            }
            else if((!arrayStr[i].isEmpty()) && (!arrayStr[i].equals("."))) {
                result.add(arrayStr[i]);
                }
            }

        String resStr = "/";
        for (int i = 0; i < result.size(); i++) {
           resStr += result.get(i) + "/";

        }
        if (resStr.length() > 1) {
            return resStr.substring(0, resStr.length() - 1);
        }
        return resStr;

    }

}
