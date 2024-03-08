#!/bin/bash

# Read user input
echo -n "Enter post title: "
read title
echo -n "Enter post body: "
read body
echo -n "Enter user ID: "
read userId

# POST data to the API endpoint
response=$(curl -s -X POST https://jsonplaceholder.typicode.com/posts \
-H "Content-Type: application/json" \
-d "{\"title\": \"$title\", \"body\": \"$body\", \"userId\": $userId}")

# Output the result
echo "sending request..."
echo "$response"
echo "done"
