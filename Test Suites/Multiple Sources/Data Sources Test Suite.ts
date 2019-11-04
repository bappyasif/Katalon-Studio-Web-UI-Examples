<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Multiple Data Sources Test Suite Example</description>
   <name>Data Sources Test Suite</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>635c5e29-4524-464f-a07b-2f7487c4f5be</testSuiteGuid>
   <testCaseLink>
      <guid>d5bb42a4-25cc-4e21-93ff-0d61483e6b98</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/From Multiple Data Sources/Login Logout Test Case</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>06d6ca01-8ed9-493f-9cb6-effa73ff5e9c</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Multiple Sources/URL Address Test Data</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b6e0fd52-2c61-42a8-b9b5-cbba0540a88f</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Multiple Sources/User Credentials Test Data</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>b6e0fd52-2c61-42a8-b9b5-cbba0540a88f</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>User Name</value>
         <variableId>5759486e-070a-49fb-8cca-18666ae7f525</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b6e0fd52-2c61-42a8-b9b5-cbba0540a88f</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>User Password</value>
         <variableId>60767c4c-f379-4385-a295-5e12518cea59</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>06d6ca01-8ed9-493f-9cb6-effa73ff5e9c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>URL</value>
         <variableId>d358645a-eb07-4e0d-ba0c-2ae4c49e8535</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
