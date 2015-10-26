package com.inspiredandroid.linuxcommandbibliotheca.models;

import java.io.Serializable;

/**
 * Created by Simon Schubert
 */
public class CommandCompatibilityModel implements Serializable {

    private int system = 0;
    private int version = 0;

    public int getSystem()
    {
        return system;
    }

    public int getVersion()
    {
        return version;
    }
}
