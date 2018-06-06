To import this into Intellij properly, do the following:

1. File -> New -> Project From Existing Sources
2. Navigate to pom.xml (to import as a Maven project)
3. Click "Import Maven projects automatically" -> Click next until finished
4. Open Project View (alt-1).
5. Right click "main" (under src) -> Mark Directory As -> Sources Root
6. Right click "resources" (under src) -> Mark Directory As -> Resources Root 

If you're getting a language level error (happens sometimes after Maven import), then do the following:

File -> Project Structure -> Modules -> Language Level (change to 8 or higher)
