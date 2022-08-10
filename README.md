# final-project  
# https://github.com/alonkochav/final-project

UI TESTING - Web   (Platform Name = "web" )
----------------
Grafana for Windows:
https://dl.grafana.com/enterprise/release/grafana-enterprise-9.0.5.windows-amd64.zip

1. Run Grafana server 
   local path :  D:\Automation\Grafana\grafana-9.0.5\bin> .\grafana-server.exe  --> runs on localhost:3000
2. Run TestGrafanaWeb sanity test case
3. Run Allure for Reports


UI TESTING - Mobile  (Platform Name = "mobile" )
----------------
1. Install APK from Software folder onto Mobile device.   ( ukMortgageCalc.apk )
2. Run Appium Studio with mobile device connected.
3. Run TestMortgageMobile sanity test case
4. Run Allure for Reports


REST API TESTING  (Platform Name = "api" )
----------------

1. Run Grafana server
   local path :  D:\Automation\Grafana\grafana-9.0.5\bin> .\grafana-server.exe  --> runs on localhost:30002. Run Appium Studio with mobile device connected.
2. Run TestGrafanaAPI sanity test case


UI TESTING - Electron   (Platform Name = "electron" )
----------------
1. Install TodoList for Windows from Software folder.   ( TodoList-Setup.exe )
2. Run TestTodoElectron sanity test case
3. Run Allure for Reports

UI TESTING - WinAppDriver ( Desktop)   (Platform Name = "desktop" )
----------------
1. Make sure running on Windows 10 or 11.
2. Run TestCalculatorDesktop sanity test case
3. Run Allure for Reports