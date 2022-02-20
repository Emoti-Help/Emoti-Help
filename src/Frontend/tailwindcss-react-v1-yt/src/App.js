import React from 'react';
import emotes from './Assets/emotes.jpeg';
import './App.css';
import Dropzone from "react-dropzone";
import ImgUpload from "./Components/fileUpload";
import landingPage from "./Components/landingPage";


function App() {
  return (
    <div className="App bg-blue-900">

      <div className="font-sans bg-white flex flex-col min-h-screen w-full">
    <div>
    <div className="bg-gray-200 px-4 py-4">
      <div
        className="w-full md:max-w-6xl md:mx-auto md:flex md:items-center md:justify-between"
      >
        <div>
          <a href="#" className="inline-block py-2 text-gray-800 text-2xl font-bold"
            > Emoti-Help.</a
          >
        </div>

        <div>
          <div className="hidden md:block">
            <a
              href="#"
              className="inline-block py-1 md:py-4 text-gray-600 mr-6 font-bold"
              >How it Works</a
            >
            <a
              href="#"
              className="inline-block py-1 md:py-4 text-gray-500 hover:text-gray-600 mr-6"
              > Team </a
            >

          </div>
        </div>

        <div className="hidden md:block">
          <a
            href="#"
            className="inline-block py-1 md:py-4 text-gray-500 hover:text-gray-600 mr-6"
            >Login</a
          >
          <a
            href="#"
            className="inline-block py-2 px-4 text-gray-700 bg-white hover:bg-gray-100 rounded-lg"
            >Try It Now</a
          >
        </div>
      </div>
    </div>

    <div className="bg-gray-200 md:overflow-hidden">
      <div className="px-4 py-16">
        <div className="relative w-full md:max-w-2xl md:mx-auto text-center">
          <h1
            className="font-bold text-gray-700 text-xl sm:text-2xl md:text-5xl leading-tight mb-6"
          >
            A Tool To Detect Emotions From Images
          </h1>

          <p className="text-gray-600 md:text-xl md:px-18">
            Try our tool now! All you need to do is upload an image and Emoti-help will detect the emotions.
          </p>

          <div
            className="hidden md:block h-40 w-40 rounded-full bg-blue-800 absolute right-0 bottom-0 -mb-64 -mr-48"
          ></div>

          <div
            className="hidden md:block h-5 w-5 rounded-full bg-yellow-500 absolute top-0 right-0 -mr-40 mt-32"
          ></div>
        </div>
      </div>

      <svg
        className="fill-current bg-gray-200 text-white hidden md:block"
        xmlns="http://www.w3.org/2000/svg"
        viewBox="0 0 1440 320"
      >
        <path
          fill-opacity="1"
          d="M0,64L120,85.3C240,107,480,149,720,149.3C960,149,1200,107,1320,85.3L1440,64L1440,320L1320,320C1200,320,960,320,720,320C480,320,240,320,120,320L0,320Z"
        ></path>
      </svg>
    </div>

          <ImgUpload />

    </div>
    </div>


    </div>


  );
}

export default App;




