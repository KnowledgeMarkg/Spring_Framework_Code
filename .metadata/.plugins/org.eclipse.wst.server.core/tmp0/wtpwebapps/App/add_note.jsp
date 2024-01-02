<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Input Form</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css">
</head>
<body class="bg-gray-100">
	<%@ include file="Navbar.jsp"%>
	<div class="mx-auto p-8 ">
		<h1 class="text-3xl font-bold mb-4 text-center">User Input Form</h1>

		<!-- Form -->
		<form action="SaveNoteServlet" method="post" class="max-w-lg mx-auto">
			<!-- Title Input -->
			<div class="mb-4">
				<label for="title"
					class="block text-gray-700 text-sm font-bold mb-2">Title:</label> <input
					type="text" id="title" name="title"
					class="w-full p-2 border rounded-md" placeholder="Enter the title"
					required>
			</div>

			<!-- Content Input -->
			<div class="mb-6">
				<label for="content"
					class="block text-gray-700 text-sm font-bold mb-2">Content:</label>
				<textarea id="content" name="content"
					class="w-full p-2 border rounded-md"
					placeholder="Enter the content" rows="4" required></textarea>
			</div>

			<!-- Submit Button -->
			<div class="flex items-center justify-between">
				<button type="submit"
					class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">Add Note</button>
			</div>
		</form>
	</div>

</body>
</html>
