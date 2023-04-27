package decorator.adapter;

import java.util.stream.IntStream;

public class MyStringBuilder {

  private StringBuilder sb = new StringBuilder();

  public MyStringBuilder() {
    sb = new StringBuilder();
  }

  public MyStringBuilder(String str) {
    sb = new StringBuilder(str);
  }

  public MyStringBuilder appendLine(String str) {
    return append(str).append(System.lineSeparator());
  }

  @Override
  public String toString() {
    return sb.toString();
  }

  //////// String decoration
  public MyStringBuilder concat(String str) {
    return new MyStringBuilder(toString().concat(str));
  }

  /////// StringBuilder decoration
  public int compareTo(StringBuilder another) {
    return sb.compareTo(another);
  }

  public MyStringBuilder append(Object obj) {
    sb = sb.append(obj);
    return this;
  }

  public MyStringBuilder append(String str) {
    sb = sb.append(str);
    return this;
  }

  public MyStringBuilder append(StringBuffer sb) {
    this.sb = this.sb.append(sb);
    return this;
  }

  public MyStringBuilder append(CharSequence s) {
    sb = sb.append(s);
    return this;
  }

  public MyStringBuilder append(CharSequence s, int start, int end) {
    sb = sb.append(s, start, end);
    return this;
  }

  public MyStringBuilder append(char[] str) {
    sb = sb.append(str);
    return this;
  }

  public MyStringBuilder append(char[] str, int offset, int len) {
    sb = sb.append(str, offset, len);
    return this;
  }

  public MyStringBuilder append(boolean b) {
    sb = sb.append(b);
    return this;
  }

  public MyStringBuilder append(char c) {
    sb = sb.append(c);
    return this;
  }

  public MyStringBuilder append(int i) {
    sb = sb.append(i);
    return this;
  }

  public MyStringBuilder append(long lng) {
    sb = sb.append(lng);
    return this;
  }

  public MyStringBuilder append(float f) {
    sb = sb.append(f);
    return this;
  }

  public MyStringBuilder append(double d) {
    sb = sb.append(d);
    return this;
  }

  public MyStringBuilder appendCodePoint(int codePoint) {
    sb = sb.appendCodePoint(codePoint);
    return this;
  }

  public MyStringBuilder delete(int start, int end) {
    sb = sb.delete(start, end);
    return this;
  }

  public MyStringBuilder deleteCharAt(int index) {
    sb = sb.deleteCharAt(index);
    return this;
  }

  public MyStringBuilder replace(int start, int end, String str) {
    sb = sb.replace(start, end, str);
    return this;
  }

  public MyStringBuilder insert(int index, char[] str, int offset, int len) {
    sb = sb.insert(index, str, offset, len);
    return this;
  }

  public MyStringBuilder insert(int offset, Object obj) {
    sb = sb.insert(offset, obj);
    return this;
  }

  public MyStringBuilder insert(int offset, String str) {
    sb = sb.insert(offset, str);
    return this;
  }

  public MyStringBuilder insert(int offset, char[] str) {
    sb = sb.insert(offset, str);
    return this;
  }

  public MyStringBuilder insert(int dstOffset, CharSequence s) {
    sb = sb.insert(dstOffset, s);
    return this;
  }

  public MyStringBuilder insert(int dstOffset, CharSequence s, int start, int end) {
    sb = sb.insert(dstOffset, s, start, end);
    return this;
  }

  public MyStringBuilder insert(int offset, boolean b) {
    sb = sb.insert(offset, b);
    return this;
  }

  public MyStringBuilder insert(int offset, char c) {
    sb = sb.insert(offset, c);
    return this;
  }

  public MyStringBuilder insert(int offset, int i) {
    sb = sb.insert(offset, i);
    return this;
  }

  public MyStringBuilder insert(int offset, long l) {
    sb = sb.insert(offset, l);
    return this;
  }

  public MyStringBuilder insert(int offset, float f) {
    sb = sb.insert(offset, f);
    return this;
  }

  public MyStringBuilder insert(int offset, double d) {
    sb = sb.insert(offset, d);
    return this;
  }

  public int indexOf(String str) {
    return sb.indexOf(str);
  }

  public int indexOf(String str, int fromIndex) {
    return sb.indexOf(str, fromIndex);
  }

  public int lastIndexOf(String str) {
    return sb.lastIndexOf(str);
  }

  public int lastIndexOf(String str, int fromIndex) {
    return sb.lastIndexOf(str, fromIndex);
  }

  public MyStringBuilder reverse() {
    sb = sb.reverse();
    return this;
  }

  public int length() {
    return sb.length();
  }

  public int capacity() {
    return sb.capacity();
  }

  public void ensureCapacity(int minimumCapacity) {
    sb.ensureCapacity(minimumCapacity);
  }

  public void trimToSize() {
    sb.trimToSize();
  }

  public void setLength(int newLength) {
    sb.setLength(newLength);
  }

  public char charAt(int index) {
    return sb.charAt(index);
  }

  public int codePointAt(int index) {
    return sb.codePointAt(index);
  }

  public int codePointBefore(int index) {
    return sb.codePointBefore(index);
  }

  public int codePointCount(int beginIndex, int endIndex) {
    return sb.codePointCount(beginIndex, endIndex);
  }

  public int offsetByCodePoints(int index, int codePointOffset) {
    return sb.offsetByCodePoints(index, codePointOffset);
  }

  public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
    sb.getChars(srcBegin, srcEnd, dst, dstBegin);
  }

  public void setCharAt(int index, char ch) {
    sb.setCharAt(index, ch);
  }

  public String substring(int start) {
    return sb.substring(start);
  }

  public CharSequence subSequence(int start, int end) {
    return sb.subSequence(start, end);
  }

  public String substring(int start, int end) {
    return sb.substring(start, end);
  }

  public IntStream chars() {
    return sb.chars();
  }

  public IntStream codePoints() {
    return sb.codePoints();
  }

  public boolean isEmpty() {
    return sb.isEmpty();
  }
}
