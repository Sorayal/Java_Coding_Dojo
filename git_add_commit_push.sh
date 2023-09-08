# hiding commands for terminal
# Script for git to quickly add, commit and push changes to the remote repository from current working directory.
#! /bin/bash
@echo off
git add .
git commit -m "update"
git push
read -p "Press any key to resume ..."