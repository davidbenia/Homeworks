package filemanipulation;

import java.io.IOException;

interface Writer_Interface{
    boolean checkPath(String path) throws IOException;
}

interface Redactor_Interface{
    boolean checkPath(String path) throws IOException;
}