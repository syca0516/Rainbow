package org.xiaojinlong.rainbow;

/**
 * Jin Long
 * 2015/7/28
 */
public class URI {

    private String uri;
    private String[] keys;

    public URI(String uri) {
        this.uri = uri;
        keys = uri.split("/");
    }

    public String get(int pos) {
        return keys[pos + 1];
    }

    @Override
    public String toString() {
        return uri;
    }
}
