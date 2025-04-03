# Design Patterns Homework: Proxy & Flyweight

## Overview
This project demonstrates the implementation of two core structural design patterns in Java:
- Proxy Pattern (Real Estate Image Manager)
- Flyweight Pattern (Map Marker Optimization)

---

## 🔹 1. Proxy Pattern – Real Estate Image Manager

### What Problem Was Solved?
In a real estate web application, agents upload high-resolution property images. However, loading these full-size images immediately can severely impact page load times and user experience. Additionally, unauthorized users should not be allowed to upload or manage image content.

### How the Pattern Simplified or Optimized the Design
The Proxy Pattern was used to delay the loading of large image files using a `ProxyImage` class, which shows a lightweight thumbnail initially and loads the full-resolution image only when `displayFullImage()` is explicitly called. This reduced memory usage and improved performance.  
A **Protection Proxy** (`ImageUploader`) was added to restrict image uploads to authenticated users only, enforcing access control at the design level without exposing the underlying functionality directly.

---

## 🔹 2. Flyweight Pattern – Map Marker Optimization

### What Problem Was Solved?
In a map-based application rendering thousands of markers (restaurants, hospitals, gas stations), each marker might share the same icon, color, and label style. Without optimization, this would lead to massive duplication of identical style data and unnecessary memory consumption.

### How the Pattern Simplified or Optimized the Design
The Flyweight Pattern was applied by implementing a `MarkerStyleFactory` to manage shared `MarkerStyle` objects. Instead of storing duplicate style data across thousands of markers, only a few shared instances were created and reused. This significantly optimized memory usage.  
For additional insight, logging was added to count both the **total style requests** and the **unique style objects created**, clearly demonstrating the efficiency of the Flyweight Pattern in large-scale rendering scenarios.

