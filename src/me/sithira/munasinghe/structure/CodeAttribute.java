package me.sithira.munasinghe.structure;

import java.io.DataInputStream;
import java.io.IOException;

public class CodeAttribute
{

    private int attribute_name_index;

    private long attribute_length;

    private int max_stack;

    private int max_locals;

    private long code_length;

    private byte[] code;

    private ExceptionTable exceptionTable;

    private int attribute_count;

    private Attribute[] attributes;

    CodeAttribute(DataInputStream dis) throws IOException
    {

        attribute_name_index = dis.readUnsignedShort();

        attribute_length = (long) dis.readUnsignedShort() << 16 | dis.readUnsignedShort();

        max_stack = dis.readUnsignedShort();

        max_locals = dis.readUnsignedShort();

        code_length = (long) dis.readUnsignedShort() << 16 | dis.readUnsignedShort();

        code = new byte[(int) code_length];

        for (int i = 0; i < code_length; i++)
        {
            code[i] = (byte) dis.readUnsignedByte();
        }

        attributes = new Attribute[(int) code_length];

        for (int i = 0; i < ; i++)
        {

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

    public int getMax_stack() {
        return max_stack;
    }

    public void setMax_stack(int max_stack) {
        this.max_stack = max_stack;
    }

    public int getMax_locals() {
        return max_locals;
    }

    public void setMax_locals(int max_locals) {
        this.max_locals = max_locals;
    }

    public long getCode_length() {
        return code_length;
    }

    public void setCode_length(long code_length) {
        this.code_length = code_length;
    }

    public byte[] getCode() {
        return code;
    }

    public void setCode(byte[] code) {
        this.code = code;
    }


}
