package me.sithira.munasinghe.structure;

import java.io.DataInputStream;
import java.io.IOException;

public class Method
{

    private int access_flags;

    private int name_index;

    private int descriptor_index;

    private int attribute_count;

    private Attribute[] attribute_info;

    public Method(DataInputStream dis) throws IOException
    {
        access_flags = dis.readUnsignedShort();

        name_index = dis.readUnsignedShort();

        descriptor_index = dis.readUnsignedShort();

        attribute_count = dis.readUnsignedShort();

        attribute_info = new Attribute[attribute_count];

        for (int i = 0; i < attribute_count; i++)
        {
            attribute_info[i] = new Attribute(dis);
        }
    }

}
