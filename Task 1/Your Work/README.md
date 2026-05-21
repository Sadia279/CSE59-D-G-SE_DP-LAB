# Your SRS


# **Software Requirements Specification (SRS)**

**Project Title:** Alarm Clock Application
**Prepared By:** [Your Name]
**Date:** [Current Date]
**Version:** 1.0

---

## **1. Introduction**

### 1.1 Purpose

The purpose of this project is to develop a **desktop-based Alarm Clock application** using Java Swing. The application allows users to set alarms for specific times and dates, manage multiple alarms, and receive notifications with sound when the alarm triggers. This system is intended for personal use on a desktop environment.

### 1.2 Scope

The Alarm Clock application provides the following functionality:

* Set alarms with a specific **time** and **date**.
* Supports both **24-hour** and **12-hour (AM/PM)** time formats.
* Display a list of all active alarms.
* Reset and delete alarms.
* Notify the user via a **popup message** and **sound** when an alarm triggers.
* Simple, visually appealing GUI with a **background image** and semi-transparent list for alarms.

The application will run on any platform supporting Java Runtime Environment (JRE) version 8 or higher.

### 1.3 Definitions, Acronyms, and Abbreviations

* **GUI**: Graphical User Interface
* **JRE**: Java Runtime Environment
* **SRS**: Software Requirements Specification

---

## **2. Overall Description**

### 2.1 Product Perspective

The Alarm Clock is a standalone desktop application implemented using **Java Swing**. It does not require any server or database connection. All alarms are stored in memory for the duration of the application session.

### 2.2 Product Functions

The main functions of the Alarm Clock are:

1. **Input Alarm Time and Date**: Users can enter the desired time and date for the alarm.
2. **Time Format Selection**: Users can select between 12-hour and 24-hour formats.
3. **Set Alarm**: Adds the alarm to the active list and schedules it.
4. **Reset Alarm**: Clears all alarms and stops any ringing alarms.
5. **Display Active Alarms**: Shows all currently set alarms in a scrollable list.
6. **Trigger Alarm Notification**: Displays a popup and plays sound when an alarm time is reached.

### 2.3 User Classes and Characteristics

* **End User**: Individuals using the desktop application to manage personal alarms.

  * Must have basic knowledge of using desktop applications.
  * Must understand time and date formats.

### 2.4 Operating Environment

* Desktop system with **Java Runtime Environment (JRE 8 or above)**.
* Operating Systems: Windows, macOS, Linux.
* Required files: `background.jpg` for GUI background, `sound2.wav` for alarm sound.

### 2.5 Design and Implementation Constraints

* Uses Java Swing for GUI.
* Alarm storage is temporary (in-memory) and not persisted across sessions.
* Alarm sound file (`sound2.wav`) must exist in the project directory.
* Requires a background image for visual enhancement.

### 2.6 Assumptions and Dependencies

* The system clock on the user’s computer is accurate.
* The user will provide valid input formats for date and time.
* Users have access to a file system with the necessary media files.

---

## **3. Specific Requirements**

### 3.1 Functional Requirements

| ID  | Requirement Description                                             |
| --- | ------------------------------------------------------------------- |
| FR1 | Allow user to input alarm time in 24-hour or 12-hour format.        |
| FR2 | Allow user to input alarm date in `dd-MM-yyyy` format.              |
| FR3 | Validate user input and show error messages for invalid time/date.  |
| FR4 | Display the list of all set alarms in a scrollable panel.           |
| FR5 | Schedule the alarm to trigger at the exact date and time.           |
| FR6 | Trigger alarm notification with a popup and sound.                  |
| FR7 | Provide a reset button to clear all alarms and stop ringing alarms. |
| FR8 | Stop the alarm sound when dismissed by the user.                    |
| FR9 | Display currently set alarm in a status label.                      |

### 3.2 Non-Functional Requirements

* **Performance**: Alarm should trigger within one second of the scheduled time.
* **Reliability**: Alarms must trigger correctly as long as the application is running.
* **Usability**: The GUI should be intuitive with clear labels and buttons.
* **Portability**: The application should run on any OS supporting JRE 8+.
* **Maintainability**: Code is modular, with separate methods for playing/stopping sound and managing alarms.

### 3.3 External Interface Requirements

* **User Interface**: GUI with input fields, combo boxes, buttons, labels, and scrollable list.
* **Hardware Interface**: Requires speakers to play alarm sound.
* **Software Interface**: Java Swing for GUI, Java Sound API for alarm audio.

### 3.4 Performance Requirements

* The alarm check runs every second using `TimerTask`.
* Minimal CPU usage during idle waiting.

### 3.5 Design Constraints

* The alarm list is stored in memory; alarms are not persistent after closing the application.
* Uses fixed file paths for background image and alarm sound.

---

## **4. System Features**

1. **Set Alarm Feature**

   * Input: Time and date.
   * Action: Validate input and add to list.
   * Output: Updated alarm list and status label.

2. **Alarm Notification**

   * Input: System time matches alarm time.
   * Action: Play sound and show popup.
   * Output: Alarm is removed from the list after dismissal.

3. **Reset Feature**

   * Input: Click reset button.
   * Action: Clear all alarms and stop sounds.
   * Output: Empty list and cleared status label.

---

## **5. External Interface Description**

* **GUI**:

  * Time Input Field
  * Date Input Field
  * Time Format ComboBox
  * Buttons: Set Alarm, Reset
  * Scrollable list of alarms
  * Status label showing the current alarm set

* **Audio**: Plays `sound2.wav` for alarm notification.

* **Visuals**: Background image `background.jpg` applied to main frame.

---

## **6. Other Requirements**

* Error handling for invalid time/date formats.
* Supports multiple alarms simultaneously.
* Application should not crash if the sound file is missing, but should log an error.


