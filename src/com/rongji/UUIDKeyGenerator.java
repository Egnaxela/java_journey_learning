package com.rongji;

import java.net.InetAddress;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UUIDKeyGenerator
{
  SecureRandom seeder;
  private String midValue;

  private UUIDKeyGenerator()
    throws Exception
  {
    StringBuilder buffer = new StringBuilder(16);
    byte[] addr = InetAddress.getLocalHost().getAddress();
    buffer.append(toHex(toInt(addr), 8));
    buffer.append(toHex(System.identityHashCode(UUIDKeyGenerator.class), 8));
    this.midValue = buffer.toString();
    this.seeder = new SecureRandom();
  }

  public static UUIDKeyGenerator newInstance() {
    UUIDKeyGenerator instance = null;
    try {
      instance = new UUIDKeyGenerator();
    } catch (Exception ex) {
      Logger.getLogger(UUIDKeyGenerator.class.getName()).log(Level.SEVERE, null, ex);
    }
    return instance;
  }

  public String generateKey()
  {
    StringBuilder buffer = new StringBuilder(32);
    buffer.append(toHex((int)(System.currentTimeMillis() & 0xFFFFFFFF), 8));
    buffer.append(this.midValue);
    buffer.append(toHex(this.seeder.nextInt(), 8));
    return buffer.toString();
  }

  private String toHex(int value, int length)
  {
    char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

    StringBuilder buffer = new StringBuilder(length);
    int shift = length - 1 << 2;
    int i = -1;
    while (true) { i++; if (i >= length)
        break;
      buffer.append(hexDigits[(value >> shift & 0xF)]);
      value <<= 4;
    }

    return buffer.toString();
  }

  private static int toInt(byte[] bytes)
  {
    int value = 0;
    int i = -1;
    while (true) { i++; if (i >= bytes.length)
        break;
      value <<= 8;
      int b = bytes[i] & 0xFF;
      value |= b;
    }

    return value;
  }

  public static void main(String[] args)
  {
    try
    {
      UUIDKeyGenerator id = new UUIDKeyGenerator();

      String uuid = id.generateKey().toString();
      System.out.println(uuid);
      uuid = id.generateKey().toString();
      System.out.println(uuid);
      uuid = id.generateKey().toString();
      System.out.println(uuid);
      uuid = id.generateKey().toString();
      System.out.println(uuid);
      uuid = id.generateKey().toString();
      System.out.println(uuid);
      uuid = id.generateKey().toString();
      System.out.println(uuid);
      uuid = id.generateKey().toString();
      System.out.println(uuid);
      uuid = id.generateKey().toString();
      System.out.println(uuid);
      uuid = id.generateKey().toString();
      System.out.println(uuid);
      uuid = id.generateKey().toString();
      System.out.println(uuid);
      uuid = id.generateKey().toString();
      System.out.println(uuid);
      uuid = id.generateKey().toString();
      System.out.println(uuid);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}