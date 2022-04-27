# project-captcha
<strong>What user stories were completed this iteration?</strong>
<p>- We added background shapes and other distortions to the captcha string. These shapes were randomized in size, color, and position. We also implemented difficulty levels to the captcha, so that the user is prompted to match the captcha string 3 times. In each level (3 in total) the difficulty of interpreting the captcha string is increased. For example, the first level just prompts the user to transcribe a short to mid-length randomized string. The second level prompts the user to transcribe a mid to long-length string where the characters are rotated at randomly generated angles. The final level incorporates the randomized rotation of the captcha characters as well as randomly generated shapes in the background to make it more difficult to interpret and copy the characters correctly.</p>
<p> If a user inputs the wrong string, the captcha starts over at level 1. This means that in order to pass, a user has to input the captcha string correctly consecutively.</p>
<p><strong>Is there anything that you implemented but doesn't currently work?</strong></p>
<p>- No, however please look at the note at the bottom</p>
<p><strong>What commands are needed to compile and run your code from the command line (or better yet, provide a script that people can use to run your program!) </strong></p>
<p>command 1 : javac -cp lib/stdlib-package.jar -d bin src/captcha/*.java </p>
<p>command 2: java -cp "bin:lib/stdlib-package.jar" captcha.Main_Class</p>
<p><strong>Note! These commands only work for Mac users because they are not compatible with the Windows Subsystem for Linux.</strong></p>

