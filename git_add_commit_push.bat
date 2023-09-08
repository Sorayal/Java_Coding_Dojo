:: hiding commands for terminal
:: Script for git to quickly add, commit and push changes to the remote repository from current working directory.
ECHO OFF
git add .
git commit -m "update"
git push
PAUSE