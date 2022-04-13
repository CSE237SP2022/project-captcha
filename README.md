# project-captcha
<strong>What user stories were completed this iteration?</strong>
- We made it so the captcha text string is randomly generated for each run. We also implemented a randomized distortion of the captcha string. The newly generated captcha string pops up in another window. The user then is supposed to retype the displayed text into the console to match. If the text doesn't match,
  the user is prompted again until the input is correct.
<p><strong>What user stories do you intend to complete next iteration?</strong></p>
-We intend to distort the text in the captcha further, make it so that the user has to complete a certain number of captchas in a row to pass (with leveling difficulties), and possibly add images. 
<p><strong>Is there anything that you implemented but doesn't currently work?</strong></p>
- Please look at the note at the bottom
<p><strong>What commands are needed to compile and run your code from the command line (or better yet, provide a script that people can use to run your program!) </strong></p>
<p>command 1 : javac -cp lib/stdlib-package.jar -d bin src/captcha/*.java </p>
<p>command 2: java -cp "bin:lib/stdlib-package.jar" captcha.Main_Class</p>
<p><strong>Note! These commands only work for Mac users because they are not compatible with the Windows Subsystem for Linux.</strong></p>

