# US City Map Navigation System

## Overview

This Java-based project implements a city navigation system using advanced graph algorithms to optimize route calculations for US cities. The project is structured across five milestones, gradually incorporating key algorithms and features to improve the efficiency of city map navigation.

## Milestones

### **Milestone 1: Load Data Program (LDP)**
The first step of the project focuses on loading the city data into the system. The data includes city names, distances between cities, and other relevant information required to construct the graph used in subsequent algorithms.

### **Milestone 2: Adjacency Matrix and City Finder**
This milestone introduces two critical components:
- **Adjacency Matrix**: A visual representation of the connections between cities, where each row and column corresponds to a city, and the matrix values represent distances between them.
- **CityFinder**: This component is responsible for calculating and displaying the optimal path between a specified source and destination city, leveraging the adjacency matrix to retrieve route information.

### **Milestone 3: Minimum Spanning Tree with Animations**
In this phase, **Prim’s Minimum Spanning Tree (MST)** algorithm is integrated to find the least costly connections between cities. Visual enhancements are added using animation libraries, providing an interactive view of the MST generation process.

- **Libraries used**:
  - `javax.swing.*`
  - `java.awt`
  - `java.io`
  - `java.util`
  - `javax.imageio.*`

### **Milestone 4: Bellman-Ford Algorithm and City Attributes**
The system now supports the **Bellman-Ford Algorithm**, which accounts for city-specific attributes such as:
- **Weather**: Weather conditions that might affect travel times.
- **Distance**: The physical distance between cities.
- **Gallons Required**: The amount of fuel needed for the journey.
- **Latitude & Longitude**: Geographical coordinates used to calculate distances and display cities on the map.

### **Milestone 5: Dijkstra's Algorithm**
The final milestone integrates **Dijkstra's Shortest Path Algorithm**, allowing for efficient and precise route calculations between cities, ensuring users receive the optimal navigation routes based on distance.

## Key Features

- **Efficient Route Calculations**: Implementation of Prim's MST, Bellman-Ford, and Dijkstra's algorithms for optimal pathfinding.
- **Graphical User Interface**: A user-friendly GUI developed using `javax.swing` and `java.awt` for visualizing the city map and routes.
- **Animation for Clarity**: Dynamic visualization of the algorithms through custom animations, enhancing the user's understanding of how routes are computed.
- **City Attributes**: Weather conditions, fuel consumption, and geographical data integrated into route calculations.

## Technologies Used

- **Languages**: Java
- **Algorithms**: Prim’s MST, Bellman-Ford, Dijkstra’s Shortest Path
- **Libraries**:
  - `javax.swing.*` for GUI development
  - `java.awt` for graphical components and animations
  - `java.io` for file handling
  - `java.util` for data structures and algorithms
  - `javax.imageio.*` for image handling

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or above
- IDE with Java support (e.g., IntelliJ IDEA, Eclipse)

### Running the Project

1. Clone the repository:
   ```bash
   [git clone <https://github.com/Gowtham-Pentela/Algo_Course.git>]
   ```
2. Open the project in your Java IDE.
3. Compile and run the `Main.java` file to launch the GUI for city map navigation.

### Usage

- **Load City Data**: Use the LDP (Load Data Program) to input city data, including distances and attributes.
- **View Adjacency Matrix**: Visualize the connections between cities and the distances using the adjacency matrix.
- **Find Shortest Path**: Utilize the CityFinder feature to calculate the optimal route between two cities.
- **Visualize MST**: See the minimum spanning tree generated using Prim's MST with animated graphics.
- **City Attributes**: Explore the effects of weather, fuel consumption, and other factors on the selected routes.

## Future Improvements

- **Enhanced Visuals**: Upgrade the map visualizations with satellite views and additional 3D elements.
- **Mobile Application**: Adapt the system for mobile platforms, allowing users to navigate on the go.

## Contributors

- [Gowtham Pentela](https://github.com/Gowtham-Pentela)
- [Iftequar32](https://github.com/Iftequar14)

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
