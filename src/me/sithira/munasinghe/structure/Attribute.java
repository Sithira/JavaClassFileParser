package me.sithira.munasinghe.structure;

import java.io.DataInputStream;
import java.io.IOException;

public class Attribute
{

    private int attribute_name_index;

    private long attribute_length;

    private byte[] info;

    Attribute(DataInputStream dis) throws IOException {

        attribute_name_index = dis.readUnsignedShort();

        attribute_length = (long) dis.readUnsignedShort() << 16 | dis.readUnsignedShort();

        info = new byte[(int) attribute_length];

        for (int i = 0; i < info.length; i++)
        {
            info[i] = (byte) dis.readUnsignedByte();
        }

    }

    public int getAttribute_name_index() {
        return attribute_name_index;
    }

    public void setAttribute_name_index(int attribute_name_index) {
        this.attribute_name_index = attribute_name_index;
    }

    public long getAttribute_length() {
        return attribute_length;
    }

    public void setAttribute_length(long attribute_length) {
        this.attribute_length = attribute_length;
    }

    public byte[] getInfo() {
        return info;
    }

    public void setInfo(byte[] info) {
        this.info = info;
    }

}
