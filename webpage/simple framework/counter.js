Sigma.module("Counter", function ({ $, on }) {
  let count = 0;

  function increment() {
    ++count;
    updateCounter();
  }

  function updateCounter() {
    const counterElement = $("#counter");
    counterElement.textContent = `Count: ${count}`;
  }

  return {
    init() {
      on($("#incrementBtn"), "click", increment);
    },
  };
});

document.addEventListener("DOMContentLoaded", function () {
  Sigma.Counter.init();
});
