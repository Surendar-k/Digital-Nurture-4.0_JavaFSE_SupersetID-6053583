import React from "react";

const OfficeList = () => {
  // JSX heading
  const heading = <h1>Office Space, at Affordable Range</h1>;

  // Sample image attribute (replace with real URL if needed)
  const image = (
    <img
      src="https://storage.googleapis.com/lb-images-asia/in/6550411/6445949-mehrauli-gurgaon-road.jpg?v=m1702526299"
      alt="Office space"
      style={{ width: "400px", borderRadius: "10px", margin: "10px 0" }}
    />
  );

  // Object of one office
  const sampleOffice = {
    name: "DBS",
    rent: 50000,
    address: "Chennai",
  };

  // List of office space items
  const officeSpaces = [
    {
      name: "Blue Square Tech Park",
      rent: 75000,
      address: "Sector 62, Noida",
    },
    {
      name: "Green Valley Business Hub",
      rent: 55000,
      address: "Hebbal, Bangalore",
    },
    {
      name: "Sky Tower Corporate Zone",
      rent: 90000,
      address: "Gachibowli, Hyderabad",
    },
    {
      name: "Urban Edge Workspaces",
      rent: 48000,
      address: "Salt Lake, Kolkata",
    },
  ];

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      {heading}
      {image}

      <h2>Featured Office:</h2>
      <p>
        <strong>Name:</strong> {sampleOffice.name}
      </p>
      <p>
        <strong>Rent:</strong>{" "}
        <span
          style={{
            color: sampleOffice.rent > 60000 ? "green" : "red",
            fontWeight: "bold",
          }}
        >
          ₹{sampleOffice.rent}
        </span>
      </p>
      <p>
        <strong>Address:</strong> {sampleOffice.address}
      </p>

      <h2>All Available Offices:</h2>
      <ul>
        {officeSpaces.map((office, index) => (
          <li key={index} style={{ marginBottom: "12px" }}>
            <strong>{office.name}</strong> –{" "}
            <span
              style={{
                color: office.rent > 60000 ? "green" : "red",
                fontWeight: "bold",
              }}
            >
              ₹{office.rent}
            </span>{" "}
            <br />
            <em>{office.address}</em>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default OfficeList;
