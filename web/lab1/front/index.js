const canvas = document.getElementById('graph');

const width = canvas.width;
const height = canvas.height;
const R = height / 2.5;
centerX = width / 2;
centerY = height / 2;

const ctx = canvas.getContext('2d');


ctx.beginPath();
ctx.moveTo(centerX, centerY);
ctx.lineTo(centerX, centerY - R);
ctx.lineTo(centerX - R, centerY);
ctx.lineTo(centerX - R/2, centerY);
ctx.lineTo(centerX - R/2, centerY + R);
ctx.lineTo(centerX, centerY + R);
ctx.lineTo(centerX, centerY);
ctx.lineTo(centerX + R, centerY);
ctx.arc(centerX, centerY, R, 0,3 * Math.PI / 2, true);
ctx.closePath();
ctx.fillStyle = 'rgba(51, 155, 215, 1)';
ctx.fill();

ctx.beginPath();
ctx.moveTo(centerX, 0);
ctx.lineTo(centerX, height);
ctx.moveTo(0, centerY);
ctx.lineTo(width, centerY);
ctx.strokeStyle = "black";
ctx.stroke();

ctx.font = "12px monospace";

ctx.strokeText("0", centerX + 6, centerY - 6);
ctx.strokeText("R/2", centerX + R / 2 - 6, centerY - 6);
ctx.strokeText("R", centerX + R - 6, centerY - 6);

ctx.strokeText("-R/2", centerX - R / 2 - 18, centerY - 6);
ctx.strokeText("-R", centerX - R - 6, centerY - 6);

ctx.strokeText("R/2", centerX + 6, centerY - R / 2 + 6);
ctx.strokeText("R", centerX + 6, centerY - R + 6);

ctx.strokeText("-R/2", centerX + 6, centerY + R / 2 + 6);
ctx.strokeText("-R", centerX + 6, centerY + R + 6);