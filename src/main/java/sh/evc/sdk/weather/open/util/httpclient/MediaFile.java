package sh.evc.sdk.weather.open.util.httpclient;

import java.io.BufferedInputStream;

/**
 * 文件Bean.
 *
 * @author vioao
 */
public class MediaFile {

  private String fileName;
  private String fullName;
  private String suffix;
  private long contentLength;
  private String contentType;
  private BufferedInputStream fileStream;
  private String error;

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public long getContentLength() {
    return contentLength;
  }

  public void setContentLength(long contentLength) {
    this.contentLength = contentLength;
  }

  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public BufferedInputStream getFileStream() {
    return fileStream;
  }

  public void setFileStream(BufferedInputStream fileStream) {
    this.fileStream = fileStream;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public String toString() {
    return "MediaFile{"
            + "fileName='" + fileName + '\''
            + ", fullName='" + fullName + '\''
            + ", suffix='" + suffix + '\''
            + ", contentLength=" + contentLength
            + ", contentType='" + contentType + '\''
            + ", error='" + error + '\''
            + '}';
  }
}
