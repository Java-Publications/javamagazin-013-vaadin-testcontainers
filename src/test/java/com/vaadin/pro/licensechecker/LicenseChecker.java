package com.vaadin.pro.licensechecker;

import java.util.logging.Logger;

public class LicenseChecker  {

  public LicenseChecker() {
  }

  public static void checkLicenseFromStaticBlock(String productName, String productVersion) {
//    try {
//      checkLicense(productName, productVersion);
//    } catch (Exception var3) {
//      throw new ExceptionInInitializerError(var3);
//    }
  }

  public static void checkLicense(String productName, String productVersion) {
//    checkLicense(new Product(productName, productVersion));
  }

  public static void checkLicenseAsync(String productName, String productVersion, LicenseChecker.Callback callback) {
//    (new Thread(() -> {
//      try {
//        checkLicense(new Product(productName, productVersion));
//        callback.ok();
//      } catch (Exception var4) {
//        callback.failed(var4);
//      }
//
//    })).start();
  }

  private static void checkLicense(Product product) {
//    getLogger().fine("Checking license for " + product);
//    ProKey proKey = LocalProKey.get();
//    if (proKey == null) {
//      proKey = VaadinComIntegration.openBrowserAndWaitForKey();
//      if (proKey != null) {
//        LocalProKey.write(proKey);
//      }
//    }
//
//    ProKeyValidator.validate(product, proKey);
  }

  public static Logger getLogger() {
    return Logger.getLogger(LicenseChecker.class.getName());
  }

  public interface Callback {
    void ok();

    void failed(Exception var1);
  }
}
