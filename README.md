# Dota 2 Profile
Basic android application which displays last few heroes played by a player. This app uses a free API which is provided by the Steam community. To import the project in the workspace, first import the build.grade file into the work space and rest of the project will be automatically imported.

The application is divided into following structure:
  1. beans
  2. interfaces
  3. services
  4. ui
  5. utils
  
1. Beans:
  The beans package contains the POJO classes that are used to parse the json that is sent in the response by the api.

2. Interfaces:
  Interfaces class contains the interfaces that are used to hit the api and the details of type of query parameters that are passed to the api call.

3. Services:
  The Services package contains the service class which implements the interfaces for that particular api.

4. UI:
  The UI package contains the UI/Activity that uses the service class to work on the api.

5. Utils:
  The Utils package contains the utility methos/constants that are used in the application.


Currently the application shows the last played heroes for a particular id. For this there are two API calls, first to get the list of the heroes and second to get the details of the last 100 matches played by the player.
The names of the heroes are stored in a HashMap which contains id as the key.
The second API returns the last played heroes in form of id, which uses the HashMap created from the first API call to get the hero name.
This names are then added to an ArrayList, which is futher used to populate the listView on the home screen.

External libraries used for simplifying the API calls are Retrofit, okhttp, gson, rxjava, rxandroid.
