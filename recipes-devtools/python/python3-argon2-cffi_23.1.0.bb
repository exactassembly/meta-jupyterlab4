SUMMARY = "Argon2 for Python"
HOMEPAGE = ""
AUTHOR = " <Hynek Schlawack <hs@ox.cx>>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e91e96ef55f45fe9caf7fc3e73672c4b"

SRC_URI = "https://files.pythonhosted.org/packages/31/fa/57ec2c6d16ecd2ba0cf15f3c7d1c3c2e7b5fcb83555ff56d7ab10888ec8f/argon2_cffi-23.1.0.tar.gz"
SRC_URI[md5sum] = "7371c126f21a895b33c4fe7e00ac6fc1"
SRC_URI[sha256sum] = "879c3e79a2729ce768ebb7d36d4609e3a78a4ca2ec3a9f12286ca057e3d0db08"

S = "${WORKDIR}/argon2_cffi-23.1.0"

inherit python_hatchling

DEPENDS += "\
    ${PYTHON_PN}-hatch-vcs-native \
    ${PYTHON_PN}-hatch-fancy-pypi-readme-native \
"

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-argon2-cffi-bindings \
"

BBCLASSEXTEND = "native nativesdk"