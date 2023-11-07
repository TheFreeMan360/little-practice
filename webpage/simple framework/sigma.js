const Sigma = {
  $: function (selector) {
    return document.querySelector(selector);
  },
  on: function (element, event, callbackFunc) {
    element.addEventListener(event, callbackFunc);
  },
  module: function (name, moduleFunc) {
    this[name] = moduleFunc(this);
  },
};
