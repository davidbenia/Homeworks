package filesandfolders;

import java.io.IOException;

interface Make_Interface{
    void makeItem(String patch) throws IOException;
}

interface Move_Interface{
    boolean checkPath(String path) throws IOException;
}