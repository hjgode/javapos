   
Readme.txt

************************************************************************
* Toshiba Global Commerce Solutions, Inc.
*
* Toshiba UnifiedPOS(TM) for Windows
*
* Version: 1.14.11
*            
* Date:  Dec 15, 2022
* 
* Description:
* This is a combinied pakcage of JavaPOS(TM) and OPOS(TM) drivers to support 
* Toshiba Point of Service(POS) Peripherals. 
* 
************************************************************************

========================================================================= 

  CONTENTS:

  I     System Requirements
  II    Uninstalling the Previous Products
  III   Installing Toshiba JavaPOS/OPOS on Windows
  IV    Device Configuration (jpos.xml) for JavaPOS
  V     Limitations
  VI    Firmware File versions for selected IOs
  VII   JavaPOS Release Notes
  VIII  OPOS Release Notes
  IX    Getting Help
       
========================================================================= 

 I.    System Requirements

       Before you install the product, you should make sure that your
       system meets the following minimum requirements:

          - Pentium-class processor
          - 250 MB of RAM 
          - 375 MB of free disk space
          - Microsoft Windows Installer 3.1 (on Windows OS)

       Operating Systems supported
 
          - Microsoft Windows 10 IoT Enterprise 2015 LTSB  (64-bit)
          - Microsoft Windows 10 IoT Enterprise 2016 LTSB  (64-bit)
          - Microsoft Windows 10 IoT Enterprise 2019 LTSC  (64-bit)
		  - Microsoft Windows 10 IoT Enterprise 2021 LTSC  (64-bit)
          - Microsoft Windows 10 IoT Enterprise CBB/SAC    (64-bit)




========================================================================= 

 II.   Uninstalling the Previous Products

       Any previous versions of Toshiba UnifiedPOS for Windows must be uninstalled
       before installing this product.  It can be done either manually uninstalling 
       the product from Windows Control panel or select Upgrade option during installation.

 ==============================================================================

 III.  Installing Toshiba JavaPOS/OPOS Drivers on Windows

       To install the Toshiba JavaPOS/OPOS Drivers on Windows:
       
       1) Download the appropriate installable file(s) from:
             http://www.toshibacommerce.com/support
             - Under Hardware, select "Common Packages: Diagnostics, Drivers & Downloads'
                   - select "Restricted content" section at the bottom of the page
             - Download appropriate driver pacakge
                    
       2) Run Setup.exe and follow the directions on each panel.

       3) After the installation is complete you must restart your system
          for the configuration changes to take effect.

       4) Silent Installation and Uninstallation: Please refer to chapter 2 
          of the Toshiba UnifiedPOS User's Guide (UPOSUsersGuide.pdf) which is located 
          in <install dir>. 

 ==============================================================================
         
 IV.  Device Configuration 
        
      OPOS: Use the OPOS configuration tool to configure and test the devices.

            Start->All Programs->Toshiba UnifiedPOS for Windows->
            Toshiba OLE for Retail Point of Sale->Configuration Utility

      JavaPOS: Use the JavaPOS Control Center to configure and test devices.

            Start->All Programs->Toshiba UnifiedPOS for Windows->
            Toshiba JavaPOS -> POS Control Center

      On Windows 8.1, the Configuration Utility and POS Control Center short cuts
      will appear under Toshiba Unified POS for Windows under Windows Apps.      

      For details, please refer to Chapter 3: Configuring Devices in the 
      Toshiba UnifiedPOS User's Guide (UPOSUsersGuide.pdf) which is located 
      in <install dir>.

                   
 ==============================================================================

 V.    Limitations
 
       1) Floppy diskette distribution is not supported.

       2) Under Windows, you must have Administrative privileges to be able 
          to install/uninstall the product.
	  
       3) Under Windows, if you receive warning messages that says 
          "The software you are installing has not passed Windows Logo testing 
          to verify its compatibility....", click on "Continue Anyway" during installation.
          The kernel mode drivers are signed by Toshiba.
       
       4) Installing the product on/from a remote network drive is not
          supported.

 ==============================================================================


VI.  Firmware File versions for selected IOs

      a) Toshiba 4610 & 6145 POS Printer Firmware 
      
         **NOTE** 
         The Printer Firmware files are not automatically installed during 
         installation. 

         During installation, you must select "Update Printer Firmware Files"
         option.  The current firmware versions are:
         
         POS Printer              Version  Firmware File     Released in
         ----------------------   ------   --------------    -----------
         Toshiba 4610 TI3/4/6/7   0x57     aip46mch.hex      1.14.2
         Toshiba 4610 TI5         0x57     aip46mcd.hex      1.14.2
         Toshiba 4610 TI8/9       0x79     aip46ti8.hex      1.13.7-B 
         Toshiba 4610 1xR,2xR     0x1A.01  aip46v4.hex       1.14.7 
         Toshiba 6145 1TN,2Tx     0x051500 aip45355_00-*.dat 1.14.11
         Toshina 6145 1TN,2Tx     0x1500   aip45355.hex      1.14.11

		 
         THE PRINTER WILL NOT COME ONLINE UNTIL THE FIRMWARE IS UPDATED.  YOU WILL 
         NOTICE BOTH LIGHTS ON THE PRINTER FLASHING DURING THIS UPDATE AND IT COULD
         TAKE UP TO TEN MINUTES FOR THE UPDATE TO OCCUR. DURING THIS TIME DO NOT 
         STOP AIPCTRL, AIPFLD46 WINDOW, OR THE JAVAPOS FLASHING WINDOW.  EITHER THE 
         FILE "AIPFLD46.LOG" IN THE \POS\LOG\ DIRECTORY OR THE TRACER OUTPUT FILE WILL
         SHOW RESULTS OF THE UPDATE.

      b) The following device firmware are automatically installed and updated
         after system reboot. 

         USB POS Device           Version     Firmware File  Released in 
         --------------          ----------   --------------  -----------
                  CashDrawer                0x0120       aip4557.dat     1.13.6
         CashDrawer                0x0101       aip4558.dat     1.14.3
         CashDrawer                0x0203       aip45572.dat    1.14.8
         Displays                 
            APA                    0x0213       aip452a2.dat    1.13.7
            APA                    0x0314       aip452a3.dat    1.14.3
            APA                    0x0413       aip452a4.dat    1.14.5
            2x20 LCD               0x0210       aip45262.dat    1.14.1
            2x20 LCD               0x0312       aip45263.dat    1.14.1
            2x20 VFD               0x0217       aip45242.dat    1.14.1
            2x20 VFD               0x0315       aip45243.dat    1.14.8
            2x20 VFD               0x0217       aip45252.dat    1.14.1
            2x20 VFD               0x0315       aip45253.dat    1.14.8
            TCx 2x20               0x0422       aip45244.dat    1.14.8
            TCx 2x20               0x0422       aip45254.dat    1.14.8

         iButton (Electronic Keylock)
            iButton                0x0122       aip4502.dat     1.14.3
            iButton                0x0210       aip45022.dat    1.14.11
         MSR                       
            TCxDisplay             0x0110       aip467b.dat     1.14.9 
            TCxDisplay/TCx800      0x0207       aip467D2.dat    1.14.8
         Keyboards                 
            old Models             0x0233       aip460x2.dat    1.13.6
            Modular                0x0375       aip460x3.dat    1.14.10
            Modular                0x0402       aip46014.dat    1.14.11
            Modular                0x0402       aip46044.dat    1.14.11
            Modular                0x0402       aip46064.dat    1.14.11
            Modular                0x0402       aip46094.dat    1.14.11
            Modular (2nd Source)   0x0403       aip46024.dat    1.14.11
            4685(K03)              0x0236       aip461x2.dat    1.13.7
            PLU                    0x0112       aip461x.dat     1.13.6
            TCxDisplay             0x0112       aip467c.dat     1.14.2
         PrinterCard               0x0109       aip4533.dat     1.13.6
                                   0x0109       aip4535.dat     1.13.6
         POS USB Hub               0x0116       aip4555.dat     1.13.7-B

         4820-2xx,5xx              0x0230       aip467x2.dat    1.13.2
         4820-2xx,5xx              0x0317       aip467x3.dat    1.13.6
         4820-2xx,5xx (2nd Source) 0x0505       aip46715.dat    1.14.11
         4820-2xx,5xx (2nd Source) 0x0505       aip46735.dat    1.14.11
         4820-21x,51x              0x0414       aip467x4.dat    1.14.3 
           
         TCxWave HeadIO            0x0138       aip4500.dat     1.14.4

         TCx 800/810/810E
            BaseIO                 0x0117       aip455a_00.dat  1.14.9
            Optional USB Head Card 0x0103       aip4559.dat     1.14.11
            Optional USB Head Card 0x0301       aip45593.dat    1.14.11
            2x20                   0x0104       aip452b.dat     1.14.8
            APA                    0x0103       aip452c.dat     1.14.7
	        MSR (Generation 1)     0x0137       aip4672.dat     1.14.8
            MSR (Generation 2)     0x0207       aip467d2.dat    1.14.8
            MSR (Generation 3)     0x0312       aip467d3.dat    1.14.11 
 
========================================================================= 

VII.  JavaPOS Release Notes:

	JavaPOS 1.14.11 Release  (Dec 2022)
    ---------------------------------

        - Fixes for field defects.
        - Updates to I/O firmware.
        - Driver Enhancements.
        - Integrated GB18030 font for 6145 POS Printers.


	JavaPOS 1.14.10 Release  (Jul 2022)
    ---------------------------------

        - Fixes for field defects.
        - Updates to I/O firmware 
		
    JavaPOS 1.14.9 Release  (Nov 2021)
    ---------------------------------

        - Fixes for field defects.
        - New Systems: 
            - TOSHIBA TCx™ 810 support.
            - TOSHIBA TCx™ 810E support.
        - SLE 15 Enablement for JavaPOS.
        - Updates to I/O firmware 


    JavaPOS 1.14.8 Release  (Jun 2021)
    ---------------------------------

        - Fixes for field defects.
        - Enhancements:
           - JavaPOS
               - Cash Drawer settings updates for CheckOpenStatus and DisableCDStatus.
               - POS Printer settings updates for PrintSpeedValue
        - Updates to I/O firmware 


    JavaPOS 1.14.7 Release  (Aug 2020)
    ---------------------------------

        - New Systems/Peripherals: 
            - Fiscal Printer - 6145 1TF

        - Fixes for field defects and enhancements

        - updates to I/O firmware 
		
		
    JavaPOS 1.14.6 Release  (May 2020)
    ---------------------------------

        - New Systems/Peripherals: 
            - TCx Display 6149 - xxT/x0N

        - Fixes for field defects and enhancements

        - update IO firmware 
		
		
    JavaPOS 1.14.5 Release Updates:  (July 2019)
     -------------------------------

        - New Systems: 
            - Toshiba TCx 300 (Models 3x1)
            - Toshiba TCx 700 (Models 7x7)
        - Product installation using WiX
        - Fixes for field defects and enhancements

     JavaPOS 1.14.4 Release Updates:  (November 2018)
     -------------------------------

        - New Systems/Peripherals: 
            - Toshiba Basics Model 4750-D10
            - Toshiba TCx Printer 6145-1xx
          
        - Fixes for field defects and enhancements

        
     JavaPOS 1.14.3 Release Updates:  (May 2018)
     -------------------------------

        - New Systems/Peripherals: 
            - Toshiba TCx Printer 6145-2xx
            - Toshiba TCx 800

        - Fixes for field defects and enhancements

        - Toshiba UPOS drivers installation on Windows 7. 
             UPOS Drivers 1.14.2 and later versions use SHA-256 certificate to sign the 
             Toshiba UPOS drivers.  Base Windows 7 installation may or not contain the 
             support for SHA-256.  If you see the following messages or similar during
             Toshiba UPOS installation, the Windows 7 is missing updates to support SHA-256. 

            Windows Error Messages:
               -  Windows can't verify the publisher of this software
               -  Untrusted published dialog box

           Solution:
             1.  Connect Windows 7 host to Microsoft network, download and install latest updates.  
                 It may require one or more reboots.
             2.  Check for this KB3033929, and install if not found.  
                 Link ->  https://technet.microsoft.com/en-us/library/security/3033929
             3.  Check for this KB2921916 and update if not installed.  Refer to links below. 

                  You can download hotfix for KB2921916 from links below.
                  -----------------------------------------------------------
                  KB Article Number(s): 2921916
                  Platform: i386
                  Location: (http://hotfixv4.microsoft.com/Windows%207/Windows%20Server2008%20R2%20SP1/sp2/Fix485407/7600/free/471833_intl_i386_zip.exe)
                  -----------------------------------------------------------
                 KB Article Number(s): 2921916
                 Platform: x64
                 Location: (http://hotfixv4.microsoft.com/Windows%207/Windows%20Server2008%20R2%20SP1/sp2/Fix485407/7600/free/471834_intl_x64_zip.exe)

        - JVM Statement      
              Starting with Toshiba UnifiedPOS version 1.14.2 release, Toshiba UnifiedPOS drivers 
              no longer ship IBM JVM.  For previous releases, no fixes will be supplied for the 
              IBM JVM after Sept. 2017.
              
              Users of Toshiba JavaPOS drivers are required install a JVM as a pre-requisite.

        - RS232 Device support 
              The JavaPOS drivers support Toshiba RS232 devices through open source RxTx
              libraries.  The RxTx libraries are installed in c:\pos\javapos\rxtx directory along
              with RxTx source code.

              If the application environment is 32-bit JVM on 64-bit Windows, a 32-bit 
              rxtxSerial.dll is required.  For this, copy rxtxSerial_x86.dll over rxtxSerial.dll.  
              For details, refer to c:\pos\javapos\rxtx\readme.txt.  No changes are needed if 64-bit
              JVM is installed on 64-bit Windows.   
          
        The JavaPOS 1.14.2 product supported on:
      
        JavaPOS Controls:       1.14
        JCL :                   2.3.0
        Xerces:                 2.0.1
        XML4C                   5.8.2
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2     

     JavaPOS 1.14.2A Release Updates:  (December 2017)
     -------------------------------
         - Service Release for 1.14.2  

         - Fixes for field defects and enhancement

         - IO firmware updates

        - Toshiba UPOS drivers installation on Windows 7. 
             UPOS Drivers 1.14.2 and later versions use SHA-256 certificate to sign the 
             Toshiba UPOS drivers.  Base Windows 7 installation may or not contain the 
             support for SHA-256.  If you see the following messages or similar during
             Toshiba UPOS installation, the Windows 7 is missing updates to support SHA-256. 

            Windows Error Messages:
               -  Windows can't verify the publisher of this software
               -  Untrusted published dialog box

           Solution:
             1.  Connect Windows 7 host to Microsoft network, download and install latest updates.  
                 It may require one or more reboots.
             2.  Check for this KB3033929, and install if not found.  
                 Link ->  https://technet.microsoft.com/en-us/library/security/3033929
             3.  Check for this KB2921916 and update if not installed.  Refer to links below. 

                  You can download hotfix for KB2921916 from links below.
                  -----------------------------------------------------------
                  KB Article Number(s): 2921916
                  Platform: i386
                  Location: (http://hotfixv4.microsoft.com/Windows%207/Windows%20Server2008%20R2%20SP1/sp2/Fix485407/7600/free/471833_intl_i386_zip.exe)
                  -----------------------------------------------------------
                 KB Article Number(s): 2921916
                 Platform: x64
                 Location: (http://hotfixv4.microsoft.com/Windows%207/Windows%20Server2008%20R2%20SP1/sp2/Fix485407/7600/free/471834_intl_x64_zip.exe)

     JavaPOS 1.14.2 Release Updates:  (November 2016)
     -------------------------------

        - New Systems/Peripherals: 
            - Toshiba TCxWave 6140-x4x and 6140-x5x

        - Fixes for field defects

        - Installation on Windows 7. 
             If you receive untrusted publisher dialog box, you must apply
             Windows hotfix KB2921916.  This is because Toshiba drivers
             are signed with SHA256 certificate. 

             You can download hotfix for KB2921916 from links below.
             -----------------------------------------------------------
             KB Article Number(s): 2921916
             Platform: i386
             Location: (http://hotfixv4.microsoft.com/Windows%207/Windows%20Server2008%20R2%20SP1/sp2/Fix485407/7600/free/471833_intl_i386_zip.exe)
             -----------------------------------------------------------
             KB Article Number(s): 2921916
             Platform: x64
             Location: (http://hotfixv4.microsoft.com/Windows%207/Windows%20Server2008%20R2%20SP1/sp2/Fix485407/7600/free/471834_intl_x64_zip.exe)

        - Changes to filenames/classpaths 
             There should no impact for applications using environmental
             variable "TOSHIBA_JPOS_CLASSPATH" set during installation.
             Otherwise, you must update your current classpath to include new
             new classpath and jar file names.

             Below are changes to path and file names.
               - Main path: c:\pos\ibmjpos           --> c:\pos\javapos 
               - c:\pos\ibmjpos\lib\ibmjavapos.jar   --> c:\pos\javapos\lib\tgcsjavapos.jar
               - in c:\pos\log directory, ibm prefix replaced with tgcs.
               
        - JVM Statement      
              Starting with Toshiba UnifiedPOS version 1.14.2 release, Toshiba UnifiedPOS drivers 
              no longer ship IBM JVM.  For previous releases, no fixes will be supplied for the 
              IBM JVM after Sept. 2017.
              
              Users of Toshiba JavaPOS drivers are required install a JVM as a pre-requisite.

        - RS232 Device support 
              The JavaPOS drivers support Toshiba RS232 devices through open source RxTx
              libraries.  The RxTx libraries are installed in c:\pos\javapos\rxtx directory along
              with RxTx source code.

              If the application environment is 32-bit JVM on 64-bit Windows, a 32-bit 
              rxtxSerial.dll is required.  For this, copy rxtxSerial_x86.dll over rxtxSerial.dll.  
              For details, refer to c:\pos\javapos\rxtx\readme.txt.  No changes are needed if 64-bit
              JVM is installed on 64-bit Windows.   
          
        The JavaPOS 1.14.2 product supported on:
      
        JavaPOS Controls:       1.14
        JCL :                   2.3.0
        Xerces:                 2.0.1
        XML4C                   5.8.2
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2     


     JavaPOS 1.14.1 Release Updates:  (January 2016)
     -------------------------------

        - New Systems/Peripherals: 
            - Toshiba TCxDisplay 6149-5SR/5SD
            - Toshiba 4610-2xR/1xR Wireless Interface
        - Microsoft Windows 10 
        - Fixes for field defects
        - Future Support statement for JVM      
              Toshiba UnifiedPOS drivers no longer ship any JVM after July 2016. 
              No fixes will be supplied for the IBM JVM after Sept. 2017.
              
              Users of Toshiba UnifiedPOS driver are encouraged to start testing their
              applications on replacement JVMs as soon as possible.
        

        The JavaPOS 1.14.1 product supported on:
        
        JVM:  IBM JVM 1.6.0-SR16 FP4
                              
        JavaPOS Controls:       1.14
        JCL :                   2.3.0
        Xerces:                 2.0.1
        XML4C                   5.8.2
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2     


     JavaPOS 1.14.0-A Release Updates:  (July 2015)
     ---------------------------------
        - Bug fix: RS485 Devices failed to enumerate when trace was enabled

     JavaPOS 1.14.0 Release Updates:  (June 2015)
     -------------------------------

        - New Systems/Peripherals: 
            - Toshiba TCx300
            - Toshiba TCx700
            - Toshiba TCx 2x20 Single-sided LCD
            - Toshiba TCx 2x20 Single-sided LCD
            - Toshiba TCx APA Single-sided 
        - Support for UPOS Standards version 1.14
        - Enhancements
           - default property of MinMicrSignalLevel set to 20 instead of 50.
        - Firmware files - refer to section VI above
        - Fixes for field defects 
        - Future Support statement for JVM       
              Toshiba UnifiedPOS drivers no longer ship any JVM after July 2016. 
              No fixes will be supplied for the IBM JVM after Sept. 2017.
              
              Users of Toshiba UnifiedPOS driver are encouraged to start testing their
              applications on replacement JVMs as soon as possible.

        The JavaPOS 1.14.0 product supported on:
        
        JVM:  IBM JVM 1.6.0-SR16 FP4
                              
        JavaPOS Controls:       1.13
        JCL :                   2.3.0
        Xerces:                 2.0.1
        XML4C                   5.8.2
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2     

     JavaPOS 1.13.7-B Release Updates:  (October 2014)
     ---------------------------------

        - New Systems/Peripherals: 
            - Toshiba Fiscal Printer 4610 model 2NF (Turkey) 
        - Enhancements
           - added directIO to retrieve USB Cash Drawer Serial Number
           - added property to set DefaultRecLineChars
        - Firmware files - refer to section VI above
        - Fixes for field defects 

        The JavaPOS 1.13.7-B product supported on:
        
        JVM:  IBM JVM 1.6.0-SR15
                              
        JavaPOS Controls:       1.13
        JCL :                   2.3.0
        Xerces:                 2.0.1
        XML4C                   5.8.2
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2

     JavaPOS 1.13.7-A Release Updates:  (August 2014)
     ---------------------------------

        - New Systems/Peripherals: 
            - Toshiba TCxWave 6140 A3x
        - Firmware files - refer to section VI above
        - Fixes for field defects 

        The JavaPOS 1.13.7-A product supported on:
        
        JVM:  IBM JVM 1.6.0-SR15
                              
        JavaPOS Controls:       1.13
        JCL :                   2.3.0
        Xerces:                 2.0.1
        XML4C                   5.8.2
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2

     JavaPOS 1.13.7 Release Updates:  (June 2014)
     -------------------------------

        - New Systems/Peripherals: 
            - Toshiba TCxFlight
            - Toshiba TCxDisplay 6149
        - Firmware files - refer to section VI above
        - Font download support for USB APA display
        - Support for Tall and Narrow Font-A(size 10x24)
        - Fixes for field defects 

        The JavaPOS 1.13.7 product supported on:
        
        JVM:  IBM JVM 1.6.0-SR15
                              
        JavaPOS Controls:       1.13
        JCL :                   2.3.0
        Xerces:                 2.0.1
        XML4C                   5.8.2
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2

     JavaPOS 1.13.6-A Release Updates:  (Feb 2014)
     ---------------------------------

        - Added OPOS Gateway checkbox for OPOS Fiscal Printer support 
        - All other content same as 1.13.6 release. 

     JavaPOS 1.13.6 Release Updates:  (Dec 2013)
     -------------------------------

        - New Peripherals: 
            - 4610-2xR/1xR Ethernet Interface
        - Firmware files - refer to section VI above
        - Fixes for field defects 

        The JavaPOS 1.13.6 product supported on:
        
        JVM:  IBM JVM 1.6.0-SR15
                              
        JavaPOS Controls:       1.13
        JCL :                   2.3.0
        Xerces:                 2.0.1
        XML4C                   5.8.2
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2


     JavaPOS 1.13.5 Release Updates:  (June 2013)
     -------------------------------

        - New POS System: 
            - Toshiba TCxWave 6140 models 100/120 
            - Toshiba 4852-570 
        - Paper Save Mode/White Space Reduction Printing on 4610-2xR/1xR Printers
        - Firmware files - refer to section VI above
        - Fixes for field defects 

        The JavaPOS 1.13.5 product supported on:
        
        JVM:  IBM JVM 1.6.0-SR9FP2
                              
        JavaPOS Controls:       1.13
        JCL :                   2.3.0
        Xerces:                 2.0.1
        XML4C                   5.8.2
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2


     JavaPOS 1.13.4 Release Updates:  (Nov 2012)
     -------------------------------
       
        - 64-bit support on selected POS systems 
            - SurePOS 700: 4900-745/775/785
            - SurePOS 300: 4810-x5x
        - GS1 Databar printing support on 4610-2xR/1NR Printers
            - Omnidirectional, Stacked Omnidirectional
            - Expanded, Expanded Stacked 
        - New firmware files - refer to section VI above
        - Fixes for field defects 

        The JavaPOS 1.13.4 product supported on:
        
        JVM:  IBM JVM 1.6.0-SR9FP2
                              
        JavaPOS Controls:       1.13
        JCL :                   2.3.0
        Xerces:                 2.0.1
        XML4C                   5.8.2
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2

     JavaPOS 1.13.3 Release Updates:  (March 2012)
     -------------------------------
       
        - New POS System: 
            - SurePOS 700: 4900-745/775/785
            - SurePOS 300: 4810-350
        - QR Code printing support on 4610-2xR/1NR Printers
        - Installation Upgrade feature: Toshiba UnifiedPOS version 1.13.3 or higher
            - Added upgrade feature to installation.  If an earlier version of Toshiba 
              UnifiedPOS is detected on the system, an option is provided to 
              upgrade the release or to cancel it.  In case of upgrade, the installation 
              will automatically un-install the old package and install the new release. 
            - Note: If you installed the Toshiba UnifiedPOS version 1.13.3 or higher and want 
              to go back to an older release, you must manually uninstall the Toshiba UnifiedPOS
              release first, then install the older version. Otherwise, the older version
              may not install correctly.  This is because the older installation releases 
              don't recognize the ProductIDs for version 1.13.3 or higher.
        - New firmware files - refer to section VI above
        - Fixes for field defects 

        The JavaPOS 1.13.3 product supported on:
        
        JVM:  IBM JVM 1.6.0-SR9FP2
                              
        JavaPOS Controls:       1.13
        JCL :                   2.3.0
        Xerces:                 2.0.1
        XML4C                   5.4.6
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2

     JavaPOS 1.13.2 Release Updates:  (Oct 2011)
     -------------------------------
       
        - New I/Os: 
            - Toshiba Modular 67-Key Keyboard with Display
        - New firmware files - refer to section VI above
        - Fixes for field defects 

        The JavaPOS 1.13.2 product supported on:
        
        JVM:  IBM JVM 1.6.0-SR9FP2
                              
        JavaPOS Controls:       1.13
        JCL :                   2.3.0
        Xerces:                 2.0.1
        XML4C                   5.4.6
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2

     JavaPOS 1.13.1 Release Updates:  (June 2011)
     -------------------------------
       
        - New firmware files - refer to section VI above
        - Microsoft Windows 7 (Professional/Ultimate) support on selected systems  
             - Toshiba 4852-526/566, Toshiba 4800-743,783,784, Toshiba 4810-34x              
        - Microsoft Windows Vista  Business/Ultimate - no longer supported
        - IBM JVM 1.6-SR9
        - Fixes for field defects 

        The JavaPOS 1.13.1 product supported on:
        
        JVM:  IBM JVM 1.6.0-SR9
                              
        JavaPOS Controls:       1.13
        JCL :                   2.3.0
        Xerces:                 2.0.1
        XML4C                   5.4.6
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2

     JavaPOS 1.13.0-A Release Updates:  (Oct 2010)
     -------------------------------
       
        - New System support:
             - SurePOS700 4800-784    
        - New I/Os: 
             - SurePoint 4820-21x, 51x   
             - 4610-1NF Fiscal Ready Printer: Turkey
        - New firmware files - refer to section VI above
        - Microsoft Windows 7 (Professional/Ultimate) support on selected systems                
        - Microsoft Windows Vista  Business/Ultimate - no longer supported
        - IBM JVM 1.6-SR8
        - Fixes for field defects 

        The JavaPOS 1.13.0 product supported on:
        
        JVM:  IBM JVM 1.6.0-SR8
                              
        JavaPOS Controls:       1.13
        JCL :                   2.3.0
        Xerces:                 2.0.1
        Log4J                   1.2.8
        XML4C                   5.4.6
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2

     JavaPOS 1.13.0 Release Updates:  (Aug 2010)
     -------------------------------
       
        - New System support:
             - SurePOS700 4800-784       
        - New firmware files - refer to section VI above
        - Microsoft Windows 7 (Professional/Ultimate) support on selected systems                
        - Microsoft Windows Vista  Business/Ultimate - no longer supported
        - IBM JVM 1.6-SR8
        - Fixes for field defects 

        The JavaPOS 1.13.0 product supported on:
        
        JVM:  IBM JVM 1.6.0-SR8
                              
        JavaPOS Controls:       1.13
        JCL :                   2.3.0
        Xerces:                 2.0.1
        Log4J                   1.2.8
        XML4C                   5.4.6
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2
          

     JavaPOS 1.12.1 Release Updates:  (Sept 2009)
     -------------------------------
       
        - Added support for the following new Systems:
            - SurePOS 500: 4852-526/566
        - Fixes for field defects and feature enhancements
        - log4j-1.2.8.jar has been removed from release
        - Refer to 1.12.0 release notes below for information
          on new jar files associated with 1.12.1 release.
        
        The JavaPOS 1.12.1 product supported on:
        
        JVM:  IBM JVM 1.5.0-SR10
                              
        JavaPOS Controls:       1.12
        JCL :                   2.2.0
        Xerces:                 2.0.1
        Log4J                   1.2.8
        XML4C                   5.4.6
        javax-usb: 
          javax-usb             1.0.2    
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2
          
       Errata for UnifiedPOS User's Guide, Keyboards, and Code Pages:
       
          Page 116: copy the aipcnpos.pcf to c:\pos\config directory.
          Page 230: GS1 DataBar Omnidirectional, GS1 DataBar Expanded,
                    and PDF-417 are supported on USB OEM scanners.
       

     JavaPOS 1.12.0 Release Updates:  (April 2009)
     ------------------------------
       
        - Added support for the following new Systems/IOs:
            - Toshiba SurePOS 300 - 4810-34x
            - Toshiba 4610-1NR high-speed Printer
        
        - New jar files and classpath variables in this release
            - jpos1122.jar   (1.12 JavaPOS Controls)
            - tgcsjavapos.jar (replaces several jar files from previous releases)  
            - Toshiba_JPOS_CLASSPATH classpath environemental variable
                 - For convenience, a new classpath variable is created.  This 
                   variable setups classpath for all jar files required by 
                   Toshiba JavaPOS. It can be used in your command line classpath, 
                   such as -cp %Toshiba_JPOS_CLASSPATH%; 
            
        - Fixes for field defects
        
        - USB Issues:
            - If you experience any USB issues with Toshiba SurePOS POS terminals and 
              peripherals, please visit the link below.  The resolution requires
              applying hotfixes from Microsoft and firmware updates for Toshiba
              peripherals.
          
                http://www-01.ibm.com/support/docview.wss?uid=pos1R1004347 
        
        The JavaPOS 1.12.0 product supported on:
        
        JVM:  IBM JVM 1.5.0-SR9
                              
        JavaPOS Controls:       1.12
        JCL :                   2.2.0
        Xerces:                 2.0.1
        Log4J                   1.2.8
        XML4C                   5.4.6
        javax-usb: 
          javax-usb             1.0.2
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2


     JavaPOS 1.9.6-B Release Updates:  (October 2008)
     -------------------------------
       
        - Addressed fields issues
            - cash Drawer issue on Toshiba SurePOS 700 (4800-7x3)
            - several printer issues.  
                       

     JavaPOS 1.9.6 Release Updates:  (August 2008)
     -----------------------------
       
        - Added support for the following new IOs:
            - Toshiba 4610-2CR/2NR high-speed Printers
            - Toshiba Modular ANPOS/CANPOS/67-Key Keyboards 
        - Fixes for field defects
        - Enhancements to Installation 
        
        The JavaPOS 1.9.6 product supported on:
        
        JVM:  IBM 1.4.2-SR11 ("J2RE 1.4.2 IBM Windows 32 build cn142-20080515 (SR11)")
                              
        JavaPOS Controls:       1.9.11
        JCL :                   2.2.0
        Xerces:                 2.0.1
        Log4J                   1.2.8
        XML4C                   5.4.6
        javax-usb: 
          javax-usb             1.0.2
          javax-usb-ri          1.0.2
          javax-usb-ri-windows  1.0.2
    
     JavaPOS 1.9.5 Release Updates  (April 2008)
     -----------------------------
       
        - Windows Vista + XP/WEPOS/Windows200:
            - Toshiba SurePOS 700 (4800-7x3)
            - Toshiba AnyPlace Kiosk (4838-5xx/7xx/9xx) 
            - Toshiba AnyPlace Kiosk (4838-3xx) 
            - Toshiba AnyPlace Hub
            - Fixes for field defects
            - Enhancements to Installation 
        
        The JavaPOS 1.9.5 product supported on:
        
        JVM:  IBM 1.4.2-SR9 ("J2RE 1.4.2 IBM Windows 32 build cn142-20070708 (SR10)")
                              
        JavaPOS Controls:       1.9.11
        JCL :                   2.2.0
        Xerces:                 2.0.1
        Log4J                   1.2.8
        XML4C                   5.4.6
        javax-usb: 
          javax-usb             1.0.1
          javax-usb-ri          1.0.1
          javax-usb-ri-windows  1.0.1
    
     JavaPOS 1.9.4 Release Updates: (October 2007)
     -----------------------------
        
        - Support for Toshiba SurePOS 700 (4800-7x3) 
        - Support for Toshiba SurePOS 100 (4613-108/118)
        - Support for Toshiba AnyPlace Kiosk (4838-5xx/7xx/9xx) 
        - Support for Toshiba AnyPlace Hub
        - Fixes for field defects
         
        The JavaPOS 1.9.4 product supported on:
        
        JVM:  IBM 1.4.2-SR9 ("J2RE 1.4.2 IBM Windows 32 build cn142-20070708 (SR9)")
                              
        JavaPOS Controls:       1.9.11
        JCL :                   2.2.0
        Xerces:                 2.0.1
        Log4J                   1.2.8
        XML4C                   5.4.6
        javax-usb: 
          javax-usb             1.0.1
          javax-usb-ri          1.0.1
          javax-usb-ri-windows  1.0.1

     JavaPOS 1.9.3 Release Updates: (June 2007)
     -----------------------------
        
        - Support for Toshiba 4846-545/565 - 17" model
        - Enhancements to POS Control Center
        - Toshiba 4610 Printer performance improvements.
        - Fixes for field defects
         
        The JavaPOS 1.9.3 product supported on:
        
        JVM:  IBM 1.4.2-SR7 ("J2RE 1.4.2 IBM Windows 32 build cn142-20061124 (SR7)")
                              
        JavaPOS Controls:       1.9.11
        JCL :                   2.2.0
        Xerces:                 2.0.1
        Log4J                   1.2.8
        XML4C                   5.4.6
        javax-usb: 
          javax-usb             1.0.1
          javax-usb-ri          1.0.1
          javax-usb-ri-windows  1.0.1

     JavaPOS 1.9.2 Release Updates: (October 2006)
     -----------------------------
       
        - Toshiba 4610 TI1/2/3/4/5/6/8/9 Printer performance improvements.
        - Support for Toshiba 4846-545/565
        - Fixes for field defects
         
        The JavaPOS 1.9.2 product supported on:
        
        JVM:  IBM 1.4.2-SR5 ("J2RE 1.4.2 IBM Windows 32 build cn142-20060421 (SR5)")
                              
        JavaPOS Controls:       1.9.11
        JCL :                   2.2.0
        Xerces:                 2.0.1
        Log4J                   1.2.8
        XML4C                   5.4.6
        javax-usb: 
          javax-usb             1.0.1
          javax-usb-ri          1.0.1
          javax-usb-ri-windows  1.0.1

     JavaPOS 1.9.1 Release Updates: (May 2006)
     -----------------------------
       
        - Toshiba 4610 TI/9 Check 21 support
        - Systems Management support for Toshiba peripheral IOs
          Please refer to ToshibaUPOSManagementServicesUsersGuide.pdf document
          for details. This document is installed on your system at
          C:\<install dir>\JavaPOS\Docs, if you have selected JavaPOS Systems 
          Management Support during installation.
        - Fixes for field defects
         
        The JavaPOS 1.9.1 product supported on:
        
        JVM:  IBM 1.4.2-SR2 ("J2RE 1.4.2 IBM Windows 32 build cn142-20050609")
        JavaPOS Controls:       1.9.11
        JCL :                   2.2.0
        Xerces:                 2.0.1
        XML4C                   5.4.6
        Log4J                   1.2.8
        javax-usb: 
          javax-usb             1.0.1
          javax-usb-ri          1.0.1
          javax-usb-ri-windows  1.0.1
        

     JavaPOS 1.9.0 Release Updates:  (Nov 2005)
     -----------------------------
       
        - Added support for Toshiba SurePOS 500 models 4851, 4951
        - Added support for omni-scanner on Toshiba 4838 Anyplace Kiosk
            - requires a separate usb driver.  See notes below.
        - UnifiedPOS 1.9.0 Specifications compliance
            - support for DeviceStatistics added
            - support for PageMode for Toshiba 4610 TI 8/9 added
        - Fixes for field defects
        - JavaPOS ControlCenter incorrectly reports a second CashDrawer and 
          HardTotals on Toshiba SP300 (4810-33H).  
         
        The JavaPOS 1.9.0 product supported on:
        
        JVM:  IBM 1.4.2-SR2 ("J2RE 1.4.2 IBM Windows 32 build cn142-20050609")
        JavaPOS Controls:       1.9.0
        JCL :                   2.2.0
        Xerces:                 2.0.1
        Log4J                   1.2.8
        javax-usb: 
          javax-usb             1.0.0-1
          javax-usb-ri          1.0.0-1
          javax-usb-ri-windows  1.0.0-2

        Anyplace Kiosk notes:
   
        - Kernel Mode driver for omni-scanner/msr on Toshiba 4838 Anyplace Kiosk:
          a separate kernel mode driver must be installed before using the scanner and msr 
          on Toshiba 4836/4838 Anyplae Kiosk.  You can download drivers from:
             http://www.toshibacommerce.com/support 
               - Under Hardware, select Kiosk and click on right arrow
               - Under 4838-13x, Click on Downloads
               - Select "IBM Anyplace Kiosk (4836.4838-13x) Scanner & MSR Driver"
    
    General Release Notes:
    ----------------------
    
    1) Cash Drawer Alarm:
      
       The command to sound Cash Drawer alarm is sent to the on-board system 
       speaker.  On some systems, if you have installed audio drivers, the alarm 
       command is directed, by the OS, to the audio port.  Therefore, you must
       disable the audio controller from Device Manager.  


    2) Toshiba 4820 keypad attached to PS/2 support:
       execute the setnumlock utility located in c:\pos\bin during startup.   
       
      
    3) PSC 384 Scanner Scale Windows USB support:
	   This device fails some basic USB standard calls which may cause the device to fail to
	   come online.  In most cases this can be worked around by doing the following:
	   a) In the Windows directory create a javaxusb.reset file
	   b) In the file type "vid_4b3&pid_4901" with no quotes
	   c) If the process was successful, when you try to open the device through
	      javapos a file named found.usb with "vid_4b3&pid_4901" included, will be 
	      created in the Windows directory
	  
========================================================================= 

VIII. OPOS Release Notes:

	JavaPOS 1.14.10 Release  (Jul 2022)
    ---------------------------------

        - Fixes for field defects.
        - Updates to I/O firmware 
		
    JavaPOS 1.14.8 Release  (Jun 2021)
    ---------------------------------

        - Fixes for field defects.
        - Enhancements:
               - Updates to build libraries.
        - Updates to I/O firmware 


     OPOS 1.14.5 Release Updates:  (July 2019)
     -----------------------------

        - New Systems: 
            - Toshiba TCx 300 (Models 3x1)
            - Toshiba TCx 700 (Models 7x7)
        - Product Installation using WiX  
        - Fixes for field defects and enhancements

     OPOS 1.14.4 Release Updates:  (November 2018)
     -----------------------------

        - New Systems/Peripherals: 
            - Toshiba Basics Model 4750-D10
            - Toshiba TCx Printer 6145-1xx
          
        - Fixes for field defects and enhancements


     OPOS 1.14.3 Release Updates:  (May 2018)
     -----------------------------

        - New Systems/Peripherals: 
            - Toshiba TCx Printer 6145-2xx
            - Toshiba TCx 800

        - Fixes for field defects and enhancements

     OPOS 1.14.2A Release Updates:  (December 2017)
     -------------------------------
         - Service Release for 1.14.2  

         - Fixes for field defects and enhancement

         - IO firmware updates

        - Toshiba UPOS drivers installation on Windows 7. 
             UPOS Drivers 1.14.2 and later versions use SHA-256 certificate to sign the 
             Toshiba UPOS drivers.  Base Windows 7 installation may or not contain the 
             support for SHA-256.  If you see the following messages or similar during
             Toshiba UPOS installation, the Windows 7 is missing updates to support SHA-256. 

            Windows Error Messages:
               -  Windows can't verify the publisher of this software
               -  Untrusted published dialog box

           Solution:
             1.  Connect Windows 7 host to Microsoft network, download and install latest updates.  
                 It may require one or more reboots.
             2.  Check for this KB3033929, and install if not found.  
                 Link ->  https://technet.microsoft.com/en-us/library/security/3033929
             3.  Check for this KB2921916 and update if not installed.  Refer to links below. 

                  You can download hotfix for KB2921916 from links below.
                  -----------------------------------------------------------
                  KB Article Number(s): 2921916
                  Platform: i386
                  Location: (http://hotfixv4.microsoft.com/Windows%207/Windows%20Server2008%20R2%20SP1/sp2/Fix485407/7600/free/471833_intl_i386_zip.exe)
                  -----------------------------------------------------------
                 KB Article Number(s): 2921916
                 Platform: x64
                 Location: (http://hotfixv4.microsoft.com/Windows%207/Windows%20Server2008%20R2%20SP1/sp2/Fix485407/7600/free/471834_intl_x64_zip.exe)

     OPOS 1.14.2 Release Updates:  (November 2016)
     -----------------------------

        - New Systems/Peripherals: 
            - Toshiba TCxWave 6140-x4x and 6140-x5x

        - Fixes for field defects

        - Installation on Windows 7. 
             If you receive untrusted publisher dialog box, you must apply
             Windows hotfix KB2921916.  This is because Toshiba drivers
             are signed with SHA256 certificate. 

             You can download hotfix for KB2921916 from links below.
             -----------------------------------------------------------
             KB Article Number(s): 2921916
             Platform: i386
             Location: (http://hotfixv4.microsoft.com/Windows%207/Windows%20Server2008%20R2%20SP1/sp2/Fix485407/7600/free/471833_intl_i386_zip.exe)
             -----------------------------------------------------------
             KB Article Number(s): 2921916
             Platform: x64
             Location: (http://hotfixv4.microsoft.com/Windows%207/Windows%20Server2008%20R2%20SP1/sp2/Fix485407/7600/free/471834_intl_x64_zip.exe)

        - Changes to filenames 
             
             Below are changes file names. While old header file names are
             backward compatible, recommend using new header file names.

               - c:\pos\include\IBMFPtr.h --> TGCSFptr.h 
               - c:\pos\include\IBMPOSPtr.h --> TGCSPOSPtr.h
               - in c:\pos\log directory, ibm prefix replaced with tgcs.
               
     OPOS 1.14.1 Release Updates:  (January 2016)
     -------------------------------

        - New Systems/Peripherals: 
            - Toshiba TCxDisplay 6149-5SR/5SD
            - Toshiba 4610-2xR/1xR Wireless Interface
        - Microsoft Windows 10
        - Fixes for field defects

     OPOS 1.14.0-A Release Updates:  (July 2015)
     ------------------------------

        - Ehancements 
            - Automatically detect CheckType (MICR Device)

     OPOS 1.14.0 Release Updates:  (June 2015)
     ----------------------------

        - New Systems/Peripherals: 
            - Toshiba TCx300
            - Toshiba TCx700
            - Toshiba TCx 2x20 Single-sided LCD
            - Toshiba TCx 2x20 Single-sided LCD
            - Toshiba TCx APA Single-sided 
        - Support for UPOS Standards version 1.14.1
        - Fiscal Printer support in native OPOS for Italy, Greece. 
          This implementation replaces OPOS-Gateway.
        - Enhancements
           - default property of MinMicrSignalLevel set to 20 instead of 50.
           - Added Font download utility for RS232 4610 Printer (RS232FontUpdater)
        - Firmware files - refer to section VI above
        - Fixes for field defects 
        
     OPOS 1.13.7-B Release Updates:  (October 2014)
     ----------------------------
        - New Systems/Peripherals: 
            - Toshiba Fiscal Printer 4610 model 2NF (Turkey) 
        - Enhancements
           - added directIO to retrieve USB Cash Drawer Serial Number
        - Firmware files - refer to section VI above
        - Fixes for field defects 

     OPOS 1.13.7-A Release Updates:  (August 2014)
     ----------------------------

        - New Systems/Peripherals: 
            - Toshiba TCxWave 6140 A3x
        - Firmware files - refer to section VI above
        - Fixes for field defects 

     OPOS 1.13.7 Release Updates:  (June 2014)
     ----------------------------
        - New Systems/Peripherals: 
            - Toshiba TCxFlight
            - Toshiba TCxDisplay 6149
            - Dual Station Fiscal Printer 
        - Firmware files - refer to section VI above
        - Added source for device demo in OPOS Config Tool
        - Support for Tall and Narrow Font A(10x24)
        - Fixes for field defects 

     OPOS 1.13.6-A Release Updates:  (Feb 2014)
     ------------------------------

        - Added OPOS Gateway checkbox for OPOS Fiscal Printer support 
        - All other content same as 1.13.6 release. 


     OPOS 1.13.6 Release Updates:  (December 2013)
     ----------------------------
        - New Peripherals: 
            - 4610-2xR/1xR Ethernet Interface
        - Firmware files - refer to section VI above
        - Fixes for field defects 

     OPOS 1.13.5 Release Updates:  (June 2013)
     ----------------------------
        - New POS System: 
            - Toshiba TCxWave 6140 models 100/120
            - Toshiba 4852-570 
        - Paper Save Mode/White Space Reduction Printing on 4610-2xR/1xR Printers
        - Firmware files - refer to section VI above
        - Fixes for field defects 
        
     OPOS 1.13.4 Release Updates:  (Nov 2012)
     ----------------------------
        - 64-bit support on selected POS systems 
            - SurePOS 700: 4900-745/775/785
            - SurePOS 300: 4810-x5x
        - GS1 Databar printing support on 4610-2xR/1NR Printers
            - Omnidirectional, Stacked Omnidirectional
            - Expanded, Expanded Stacked
        - New firmware files - refer to section VI above
        - Fixes for field defects 
        
     OPOS 1.13.3 Release Updates:  (March 2012)
     ----------------------------
        - New POS System: 
            - SurePOS 700: 4900-745/775/785
            - SurePOS 300: 4810-350
        - QR Code printing support on 4610-2xR/1NR Printers
        - Installation Upgrade feature: Toshiba UnifiedPOS version 1.13.3 or higher
            - Added upgrade feature to installation.  If an earlier version of Toshiba 
              UnifiedPOS is detected on the system, an option is provided to 
              upgrade the release or to cancel it.  In case of upgrade, the installation 
              will automatically un-install the old package and install the new release. 
            - Note: If you installed the Toshiba UnifiedPOS version 1.13.3 or higher and want 
              to go back to an older release, you must manually uninstall the Toshiba UnifiedPOS
              release first, then install the older version. Otherwise, the older version
              may not install correctly.  This is because the older installation releases 
              don't recognize the ProductIDs for version 1.13.3 or higher.
        - New firmware files - refer to section VI above
        - Fixes for field defects 
        - AnyPlace Kiosk Devices Configuration; If you are upgrading AnyPlace Kiosk from an
          Toshiba UnifiedPOS release 1.12.1 or below, please refer to Migration Tips described
          under OPOS 1.13.0 Release Updates.


     OPOS 1.13.2 Release Updates:  (Oct 2011)
     ----------------------------
        - New I/Os: 
            - Toshiba Modular 67-Key Keyboard with Display
        - New firmware files - refer to section VI above
        - Fixes for field defects 

     OPOS 1.13.1 Release Updates:  (June 2011)
     ----------------------------

        - New firmware files - refer to section VI above
        - Microsoft Windows 7 (Professional/Ultimate) support on selected systems  
             - Toshiba 4852-526/566, Toshiba 4800-743,783,784, Toshiba 4810-34x              
        - Microsoft Windows Vista  Business/Ultimate - no longer supported
        - Fixes for field defects 

     OPOS 1.13.0-A Release Updates:  (Oct 2010)
     ----------------------------

        - New System support:
             - SurePOS700 4800-784
        - New I/Os: 
             - SurePoint 4820-21x, 51x  
             - 4610-1NF Fiscal Ready Printer: Turkey 
        - * Design Changes *:
             - AnyPlace Kiosk device support
             - Fiscal Printers support
             Migration tips described below
             
        - New firmware files - refer to section VI above
        - Microsoft Windows 7 (Professional/Ultimate) support on selected systems                
        - Microsoft Windows Vista  Business/Ultimate - no longer supported
        - Fixes for field defects 

        - AnyPlace Kiosk Device support changes (* DESIGN CHANGE *)

             1) The AnyPlace kiosk devices, such as Motion Sensor, Scanners, MSR are
                now supported through OPOS stack.  Previously, these devices were
                supported through OPOS Gateway which required Toshiba JavaPOS & JVM.  

             2) Migration Tips:

                 a) Uninstall previous version of OPOS
                 
                 b) delete the following registry key
                      - HKLM\SOFTWARE\OLEforRetail\ServiceInfo\Config
                      
                        Note: Otherwise, you might get an error "Input XML File empty" when
                              you open OPOS Configuration Utility

                 c) delete registry entries for previously configured AnyPlace Kiosk devices,    
                    such as MotionSensor, Scanner, and MSR

                    The registry keys for devices are located under:
                      - HKLM\SOFTWARE\SOFTWARE\OLEforRetail\ServiceOPOS

                 d) Install OPOS 1.13.0 release on AnyPlace Kiosk.  The installation
                    will automatically detect the AnyPlace Kiosk system and install
                    correct software.
                    
                 e) Re-configure the AnyPlaceKiosk devices using OPOS Configuration Tool
                    - Start OPOS Config Tool: 
                      Start->All Programs->Toshiba UnifiedPOS for Windows->
                      Toshiba OLE for Retail Point of Sale->Configuration Utility

                    - Click on SurePOS 300/500/600, Kiosk tab

                      For example, to configure scanner
                        - Click on AnyPlaceKiosk Scanner, Click on Configure
                        - Enter Device Name = same name previously used.
                        - Select Scanner Type (OmniScanner or LineScanner)
                        - Click on OK, Click on Test 
                        - Additionally, you can perform device tests from Demo tool
                          click on "Device Demo/Info" -> Demo Demo -> Demo
                      
                      Similarly, re-configure and test any other AnyPlaceKiosk devices 
                      previously configured.

        - Fiscal Printer Device support (* DESIGN CHANGE *)
        

             1) The Fiscal Printer devices are now supported through OPOS Stack.  Previously,
                the Fiscal Printers were supported through OPOS-Gateway which required IBM
                JVM and JavaPOS.  The application needs to be modified to delete the use
                of DirectIOXMLConverter.  Refer the Migration Tips below.
             
             2) Migration Tips:

                 a) Application Changes:
                      -  To use the Fiscal Printer directIOs, the application needs to be 
                         modified to REMOVE IDirectIOXMLConvert COM Interface from the project,
                         and use the standard COM interface to communicate with directIOs.  

                      -  The IDirectIOXMLConverter was introduced to support to Fiscal Printer
                         directIOs through OPOS-Gateway.  It supported the conversion of BSTR * to 
                         Java Object which was required for directIOs.
                      
                 b) Uninstall previous version of OPOS
                 
                 c) delete the following registry key
                      - HKLM\SOFTWARE\OLEforRetail\ServiceInfo\Config
                      
                        Note: Otherwise, you might get an error "Input XML File empty" when
                              you open OPOS Configuration Utility

                 d) delete registry entries for previously configured Fiscal Printers    

                    The registry keys for devices are located under:
                      - HKLM\SOFTWARE\SOFTWARE\OLEforRetail\ServiceOPOS

                 e) Re-configure the IO devices using OPOS Configuration Tool

                    - Start OPOS Config Tool: All Programs->Toshiba UnifiedPOS for Windows->
                      Toshiba OLE for Retail Point of Sale->Configuration Utility
                      
        - Systems Management support for POS IOs (* DESIGN CHANGE *)


             1) If you had used the systems management OPOS previously, it is now supported 
                through OPOS stack.  Previously, these devices were supported through OPOS 
                Gateway which required Toshiba JavaPOS & JVM.  
                
             2) Notes for Remote Management Agent(RMA)
             
                To improve performance, the OPOS systems management implementation updates
                IO properties and device statistics every hour instead of RMA polling
                frequency of 30 seconds.  The OPOS polling frequency is configurable through
                c:\pos\javapos\config\sysmgmt.properties file.  
                
                property name: #provider.dataUpdate.frequency=60  (in minutes)   
                
                To change the polling frequency, uncomment the property by deleting # and 
                modify the value.  
                
                Recommended value: >= 15.  otherwise, you may see performance degradation.
                
        
             3) Migration Tips:

                 a) Uninstall previous version of OPOS

                 b) Install OPOS 1.13.0 release. By default, the systems management 
                    option is already selected. 
                    

                 c) delete the following registry key
                      - HKLM\SOFTWARE\OLEforRetail\ServiceInfo\Config
                      
                        Note: Otherwise, you might get an error "Input XML File empty" when
                              you open OPOS Configuration Utility

                 d) Delete registry entries for previously configured IOs.
                    The registry keys for devices are located under:
                      - HKLM\SOFTWARE\SOFTWARE\OLEforRetail\ServiceOPOS

                 e) Re-configure the IO devices using OPOS Configuration Tool
                    - Start OPOS Config Tool: All Programs->Toshiba UnifiedPOS for Windows->
                      Toshiba OLE for Retail Point of Sale->Configuration Utility

     OPOS 1.13.0 Release Updates:  (Aug 2010)
     ----------------------------

        - New System support:
             - SurePOS700 4800-784

        - * Design Changes *:
             - AnyPlace Kiosk device support
             - Fiscal Printers support
             Migration tips described below
             
        - New firmware files - refer to section VI above
        - Microsoft Windows 7 (Professional/Ultimate) support on selected systems                
        - Microsoft Windows Vista  Business/Ultimate - no longer supported
        - Fixes for field defects 

        - AnyPlace Kiosk Device support changes (* DESIGN CHANGE *)

             1) The AnyPlace kiosk devices, such as Motion Sensor, Scanners, MSR are
                now supported through OPOS stack.  Previously, these devices were
                supported through OPOS Gateway which required Toshiba JavaPOS & JVM.  

             2) Migration Tips:

                 a) Uninstall previous version of OPOS

                 b) delete registry entries for previously configured AnyPlace Kiosk devices,    
                    such as MotionSensor, Scanner, and MSR

                    The registry keys for devices are located under:
                      - HKLM\SOFTWARE\OLEforRetail\ServiceOPOS

                 c) Install OPOS 1.13.0 release on AnyPlace Kiosk.  The installation
                    will automatically detect the AnyPlace Kiosk system and install
                    correct software.
                    
                 d) Re-configure the AnyPlaceKiosk devices using OPOS Configuration Tool
                    - Start OPOS Config Tool: 
                      Start->All Programs->Toshiba UnifiedPOS for Windows->
                      Toshiba OLE for Retail Point of Sale->Configuration Utility

                    - Click on SurePOS 300/500/600, Kiosk tab

                      For example, to configure scanner
                        - Click on AnyPlaceKiosk Scanner, Click on Configure
                        - Enter Device Name = same name previously used.
                        - Select Scanner Type (OmniScanner or LineScanner)
                        - Click on OK, Click on Test 
                        - Additionally, you can perform device tests from Demo tool
                          click on "Device Demo/Info" -> Demo Demo -> Demo
                      
                      Similarly, re-configure and test any other AnyPlaceKiosk devices 
                      previously configured.

        - Fiscal Printer Device support (* DESIGN CHANGE *)
        

             1) The Fiscal Printer devices are now supported through OPOS Stack.  Previously,
                the Fiscal Printers were supported through OPOS-Gateway which required IBM
                JVM and JavaPOS.  The application needs to be modified to delete the use
                of DirectIOXMLConverter.  Refer the Migration Tips below.
             
             2) Migration Tips:

                 a) Application Changes:
                      -  To use the Fiscal Printer directIOs, the application needs to be 
                         modified to REMOVE IDirectIOXMLConvert COM Interface from the project,
                         and use the standard COM interface to communicate with directIOs.  

                      -  The IDirectIOXMLConverter was introduced to support to Fiscal Printer
                         directIOs through OPOS-Gateway.  It supported the conversion of BSTR * to 
                         Java Object which was required for directIOs.

                 a) Uninstall previous version of OPOS

                 b) delete registry entries for previously configured Fiscal Printers    

                    The registry keys for devices are located under:
                      - HKLM\SOFTWARE\SOFTWARE\OLEforRetail\ServiceOPOS

                 c) Re-configure the IO devices using OPOS Configuration Tool

                    - Start OPOS Config Tool: All Programs->Toshiba UnifiedPOS for Windows->
                      Toshiba OLE for Retail Point of Sale->Configuration Utility
                      
        - Beta code: Systems Management support for POS IOs (* DESIGN CHANGE *)

             The systems management code is provided as beta code.  As such, it should be
             used in lab environment and not be deployed. 

             1) If you had used the systems management OPOS previously, it is now supported 
                through OPOS stack.  Previously, these devices were supported through OPOS 
                Gateway which required Toshiba JavaPOS & JVM.  
        
             2) Migration Tips:

                 a) Uninstall previous version of OPOS

                 b) Install OPOS 1.13.0 release. the systems management option is 
                   already selected. 

                 c) Delete registry entries for previously configured IOs.
                    The registry keys for devices are located under:
                      - HKLM\SOFTWARE\SOFTWARE\OLEforRetail\ServiceOPOS

                 d) Re-configure the IO devices using OPOS Configuration Tool
                    - Start OPOS Config Tool: All Programs->Toshiba UnifiedPOS for Windows->
                      Toshiba OLE for Retail Point of Sale->Configuration Utility

     OPOS 1.12.1 Release Updates:    (Sept 2009)
     ----------------------------

     - Added support for the following new Systems/IOs:
            - SurePOS 500: 4852-526/566
            
     - Fixes for field defects and feature enhancements
     
     Errata for UnifiedPOS User's Guide, Keyboards, and Code Pages:
       
          Page 116: copy the aipcnpos.pcf to c:\pos\config directory.
          Page 230: GS1 DataBar Omnidirectional, GS1 DataBar Expanded,
                    and PDF-417 are supported on USB OEM scanners.


     OPOS 1.12.0 Release Updates:    (April 2009)
     ----------------------------

     - Added support for the following new Systems/IOs:
            - Toshiba SurePOS 300 - 4810-34x
            - Toshiba 4610-1NR high-speed Printer
             
     - Fixes for field defects
     
     - USB Issues:
           - If you experience any USB issues with Toshiba SurePOS POS terminals and 
             peripherals, please visit the link below.  The resolution requires
             applying hotfixes from Microsoft and firmware updates for Toshiba 
             peripherals.
          
                http://www-01.ibm.com/support/docview.wss?uid=pos1R1004347 



     OPOS 1.9.6-B Release Updates:   (October 2008)
     -----------------------------

     - Addressed fields issues 
            - cash Drawer issue on Toshiba SurePOS 700 (4800-7x3)
            - several printer issues
            - opos-gateway issues.


     OPOS 1.9.6 Release Updates:     (August 2008)
     -----------------------------
       
        - Added support for the following new IOs:
            - Toshiba 4610-2CR/2NR high-speed Printers
            - Toshiba Modular ANPOS/CANPOS/67-Key Keyboards 
        - Fixes for field defects
        - Enhancements to Installation 
            
       
     OPOS 1.9.5 Release Updates:     (April 2008)
     -----------------------------
       
        - Windows Vista + XP/WEPOS/Windows200:
            - Toshiba SurePOS 700 (4800-7x3)
            - Toshiba AnyPlace Kiosk (4838-5xx/7xx/9xx)
            - Toshiba AnyPlace Kiosk (4838-3xx) 
            - Toshiba AnyPlace Hub
            - Fixes for field defects
            - Enhancements to Installation 
            
     OPOS 1.9.4 Release Updates    (October 2007)
     -----------------------------
       
        - Support for Toshiba SurePOS 700 (4800-7x3)
        - Support for Toshiba SurePOS 100 (4613-108/118)
        - Support for Toshiba AnyPlace Kiosk (4838-5xx/7xx/9xx) 
        - Support for Toshiba AnyPlace Hub
        - Fixes for field defects
          
     OPOS 1.9.3 Release Updates    (June 2007)
     -----------------------------
       
        - Support for Toshiba 4846-545/565 - 17" model
        - Provide option for installing OPOS Common Control Objects 
        - Added automatic firmware update utility for the Toshiba 4610 RS232 Printers
        - Toshiba 4610 Printer performance improvements.
        - Fixes for field defects
        - Beta code to support Systems Management on Toshiba 4610 Printers (new)
          
          The systems management on Toshiba 4610 Printers is available for beta testing.
          It is supported on OPOS using OPOS Gateway which leverages Toshiba JavaPOS driver
          stack.  Follow the instructions below:  
          o  Installation of System Management support for Toshiba 4610 Printers.
             From Main Installation menu, 
             -  select OPOS Device Support
             -  select a Toshiba system, click Next, Next, Next
             -  Click on Customize ...
             -  Under OPOS Device Support, Click on OPOS Systems Management, 
                select "This feature will be installed on local hard driver"
             -  Click OK
             -  You will be prompted to install Microsoft .NET 2.0 and IBM JVM
           o Configuration of Toshiba 4610 Printers
             - Start OPOS Configuration Utility 
                - Select Start -> Toshiba OLE for Retail Point of Sale -> Configuration Utility
                - Click on desired system/bus tab
                - Select "UPOS POSPrinter xxxx" under "POS Printer" Device Type
                - Click Configuration, enter Device Name
                - Click Test to test the device
          
    
     OPOS 1.9.2 Release Updates    (October 2006)
     -----------------------------
       
        - Toshiba 4610 TI1/2/3/4/5/6/8/9 Printer performance improvements.
        - Support for Toshiba 4846-545/565
        - Fixes for field defects
    
     OPOS 1.9.1 Release Updates    (May 2006)
     -----------------------------
       
        - Toshiba 4610 TI/9 Check 21 support
        - Fiscal Printer support through directIO
        - Fixes for field defects
    
     OPOS 1.9.0 Release Updates    (Nov 2005)
     -----------------------------  
       
        - Added support for Toshiba SurePOS 500 models 4851, 4951
        - Added support for omni-scanner on Toshiba 4838 Anyplace Kiosk
            - requires a separate usb driver.  See notes below.
        - UnifiedPOS 1.9.0 Specifications compliance
            - support for PageMode for Toshiba 4610 TI 8/9 
            - support for CheckScanner 
        - Fixes for field defects
        
        Anyplace Kiosk notes:
   
        - Kernel Mode driver for omni-scanner/msr on Toshiba 4838 Anyplace Kiosk:
          a separate kernel mode driver must be installed before using the scanner and msr 
          on Toshiba 4836/4838 Anyplae Kiosk.  You can download drivers from:
             http://www.toshibacommerce.com/support 
               - Under Hardware, select Kiosk and click on right arrow
               - Under 4838-13x, Click on Downloads
               - Select "IBM Anyplace Kiosk (4836.4838-13x) Scanner & MSR Driver"
    
    General Release Notes:
    ----------------------
    
    1) Download the current version of CommonControl objects for OPOS
       
       The tested versions of OPOS Common Control Objects are included in the 
       Toshiba UnifiedPOS for Windows release.  The information below is provided
       for reference. 

       Go to: http://www.monroecs.com/
       select POS Standards from left pane
       select OPOS -> Common Control -> Current Version
       from Downloadable files table click on current Runtime version.

    2) Motion Sensor Notes 

      If the general SurePOS 500 motion sensor is not polling after open and enable 
      the sensor, verify whether the LEGACY_ASICIO was registered under 
      HKEY_LOCAL_MACHINE/SYSTEM/CurrentControlSet/Enum/Root.  If not, make sure your 
      Task Scheduler service is started,(for Windows NT check 
      Control Panel-> services ->Task Scheduler;
      for Win2000 & Window Xp 
		check Control Panel-> Administrative Tools ->services ->Task Scheduler)
      To register this key go to Windows Explorer, 
		select POS\Bin double click install.vbs.
      To unregister this key go to Windows Explorer,
		select POS\Bin, double click uninstall.bat

    3) Toshiba 4820 keypad attached to PS/2 support:
       execute the setnumlock utility located in c:\pos\bin during startup.     
       

========================================================================= 

IX.  Getting Help

       Website
       --------
       The Toshiba Global Commerce Solutions Web site contains the latest information
       on Toshiba point-of-sale hardware, the newest versions of Toshiba point-of-sale
       software, and a knowledgebase containing hints, tips, and fixes for
       known issues/problems with Toshiba point-of-sale products.  The URL for 
       the Toshiba Global Commerce Solution web site is:
     
         http://www.toshibacommerce.com/support

       The documentation on the web site requires Adobe Acrobat Reader to view
       and print.

       UnifiedPOS Reference Guide
       --------------------------
       Toshiba UnifiedPOS User's Guide, Keyboards and Code Pages document is installed on the 
       system in pdf format.
       
       You can also obtain this document on the Toshiba support website.  Please follow 
       instructions described in one of the previous sections, shown below. 
         - section III. Installing Toshiba JavaPOS/OPOS Drivers on Windows 
           & step 1) Download the appropriate install file(s)

       Reporting Problems
       ------------------
       To report any OPOS or JavaPOS problems please log in to our website and open a new service 
       request using the 'General Support' link on the right hand side of the page.

       Please provide the following information:
          a) Detailed problem description.
          b) details about your software - OS version, driver version 
          c) information about your hardware - what system unit you are using, what device has the 
             problem, and how the device is connected to the system unit
       
       There is a guide for the service request tool on the UPOS download page.
       
       If you do not have an account on the website, or have problems with the account you do have, 
       please contact Techline using the web form at
       http://www.toshibagcs.com/support/forms/plquestions.html
       
========================================================================= 

  * IBM is a registered trademark of the International Business Machines
    Corporation.
  * Toshiba is a registered trademark of the Toshiba, Inc. 
  * Microsoft and Windows are registered trademarks of Microsoft
    Corporation.
  * Java and all Java-based trademarks and logos are trademarks or
    registered trademarks of Oracle.

 

